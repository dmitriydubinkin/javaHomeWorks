package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    // количество попыток, по заданию их три
    static final int ATTEMPTS = 3;
    // верхняя граница диапазона загадываемого числа
    static final int RANGE_MAX = 20;

    static final Scanner input = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        // выводим приветственное сообщение
        printHelloMessage();
        // запускаем игру
        playGame();
        // завершаем работу приложения
        stopApplication();
    }

    private static void printHelloMessage() {
        System.out.println("Привет дружище, тебе предстоит угадать число!");
        System.out.println("Вот подсказка, оно в диапазоне от 0 до " + RANGE_MAX);
    }

    private static void playGame() {
        do {
            int number = random.nextInt(RANGE_MAX);

            for (int i = 0; i < ATTEMPTS; i++) {
                // TODO: сделать проверку, что число в диапазоне
                int userNumber = inputNumber();

                if (userNumber == number) {
                    System.out.println("Поздравляю, вы угадали!");
                    break;
                } else if (userNumber < number) {
                    System.out.println("Ваше число меньше загаданного");
                } else if (userNumber > number) {
                    System.out.println("Ваше число больше загаданного");
                }
            }
        } while (isRepeatGame());
    }

    private static int inputNumber() {
        int value = -1;
        boolean isValidInput;

        do {
            isValidInput = true;
            System.out.print("\nВведите целое число: ");

            if (input.hasNextInt()) {
                value = input.nextInt();
            } else {
                isValidInput = false;
                System.err.println("ошибка ввода");
                input.nextLine();
            }
        } while (!isValidInput);

        return value;
    }

    private static boolean isRepeatGame() {
        // я бы просил пользователя ввести y/n, но в задании сказано 1/0
        System.out.print("Желаете повторить игру? (Да - 1, Нет - 0): ");
        // TODO: сделать проверку, что число в диапазоне 0..1
        int value = inputNumber();
        return value == 1;
    }

    private static void stopApplication() {
        input.close();
        System.exit(0);
    }
}
