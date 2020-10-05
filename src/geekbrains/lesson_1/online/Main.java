package geekbrains.lesson_1.online;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    guessTheNumber();
    }
    static void guessTheNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра угадай число");
        int range = 10;
        int a = 3;
        do {
            int number = (int) (Math.random() * range);

            System.out.println("Угадай число от 0 до " + range);
            for (int i = 0; i < a; i++) {
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали.");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                    System.out.println("У вас осталось " + (a - i - 1) + "попыток");
                } else if (input_number < number) {
                    System.out.println("Загаданное число больше");
                    System.out.println("У вас осталось " + (a - i - 1) + " попыток");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
        }
        static void guessTheWord(){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        }

}
