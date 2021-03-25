package lesson2;

import java.util.Arrays;

public class ArraysLearning {
    public static void main(String[] args) {
        // Задание 1
        initIntArrayAndInvert();
        // Задание 2
        fillEmptyArray();
    }

    private static void initIntArrayAndInvert() {
        int[] binary = {0, 1, 1, 0, 0, 1, 0};

        System.out.printf("%-20s %s%n", "Исходный", Arrays.toString(binary));

        for (int i = 0; i < binary.length; i++) {
            binary[i] = (binary[i] != 0) ? 0 : 1;
        }

        System.out.printf("%-20s %s%n", "Инвертированный", Arrays.toString(binary));
    }

    private static void fillEmptyArray() {
        final int SIZE = 8;
        int[] emptyArray = new int[SIZE];

        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i * 3;
        }

        System.out.printf("%-20s %s%n", "Результат", Arrays.toString(emptyArray));
    }
}
