package lesson3;

import java.util.Scanner;

public class Main {
    static final int RANGE_MAX = 20;
    static final Scanner input = new Scanner(System.in);

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
        // TODO: реализовать саму игру
    }

    private static void stopApplication() {
        input.close();
        System.exit(0);
    }
}
