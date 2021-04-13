import animals.Animal;
import animals.Cat;
import animals.Dog;

import java.util.Scanner;

public class Main {
    // расстояние, которое нужно пробежать
    static float runDistance = -1;
    // расстояние, на которое нужно прыгнуть
    static float jumpDistance = -1;
    // высота, которую нужно перепрыгнуть
    static float jumpHeight = -1;
    // расстояние, которое нужно проплыть
    static float swimDistance = -1;

    // животные, участвующие в соревновании
    static Animal[] animals;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        // выводим приветственное сообщение
        printHelloMessage();
        // создаем участвиков соревнования
        createParticipants();
        // начинаем соревноования
        startCompetition();
        // завершаем работу приложения
        closeApplication();
    }

    private static void printHelloMessage() {
        System.out.println("Начинаем соревнование среди животных!");
    }

    private static void createParticipants() {
        animals = new Animal[4];

        animals[0] = new Cat("Саймон", "белый", 5);
        animals[1] = new Dog("Жучка", "черный", 7);
        animals[2] = new Cat("Том", "серый", 4);
        animals[3] = new Dog("Рекс", "рыжий", 2);
    }

    private static void startCompetition() {
        do {
            // просим ввести параметры соревнования
            inputCompetitionParams();

            for (Animal animal : animals) {
                // выводим информацию о животном
                animal.printInfo();
                // просим пробежать, прыгнуть и перепрыгнуть
                animal.run(runDistance);
                animal.jump(jumpDistance);
                animal.jumpOver(jumpHeight);

                // коты по условию не умеют плавать, но если это собака
                if (animal instanceof Dog) {
                    ((Dog) animal).swim(swimDistance);
                }
            }
        } while (isRepeat());
    }

    private static void inputCompetitionParams() {
        // для упрощения не будем проверять правильность ввода
        System.out.println("Задайте необходимые параметры для трассы в метрах\n");

        System.out.print("Пробежать: ");
        runDistance = input.nextFloat();

        System.out.print("Прыгнуть на: ");
        jumpDistance = input.nextFloat();

        System.out.print("Перепрыгнуть: ");
        jumpHeight = input.nextFloat();

        System.out.print("Проплыть: ");
        swimDistance = input.nextFloat();
    }

    private static boolean isRepeat() {
        System.out.print("\nЖелаете повторить? (Да - 1, Нет - 0): ");
        // для упрощения не будем проверять правильность ввода
        int value = input.nextInt();
        return value == 1;
    }

    private static void closeApplication() {
        input.close();
        System.exit(0);
    }
}
