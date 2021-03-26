package lesson2;

import java.util.Arrays;

public class ArraysLearning {
    public static void main(String[] args) {
        // Задание 1
        initIntArrayAndInvert();
        // Задание 2
        fillEmptyArray();
        // Задание 3
        changeArrayValues();
        // Задание 4. Укажите размер матрицы
        fillArrayDiagonals(5);
        // Задание 5
        arrayMinMax();

        // Задание 6
        int[] dataset = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean isBalance = checkArrayBalance(dataset);

        if (isBalance) {
            System.out.println("В переданном массиве есть баланс");
        } else {
            System.out.println("В переданном массиве нет баланса");
        }
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

    private static void changeArrayValues() {
        int[] anotherArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.printf("%-20s %s%n", "Исходный", Arrays.toString(anotherArray));

        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] < 6) {
                anotherArray[i] *= 2;
            }
        }

        System.out.printf("%-20s %s%n", "Измененный", Arrays.toString(anotherArray));
    }

    private static void fillArrayDiagonals(int size) {
        int[][] matrix = new int[size][size];

        if (size % 2 == 0) {
            // скажите, уместно ли в java такое прерывание выполнения метода?
            System.out.println("Диагонали не получится, укажите нечетный размер ...");
            return;
        }

        for (int i = 0; i < size; i++) {
            int index = size - i - 1;
            matrix[i][i] = 1;
            matrix[index][i] = 1;
        }

        printIntMatrix(matrix);
    }

    private static void printIntMatrix(int[][] value) {
        for (int[] row : value) {
            for (int coll : row) {
                System.out.printf("%3d", coll);
            }
            System.out.println();
        }
    }

    private static void arrayMinMax() {
        int[] values = {3, 7, -2, 3, 5, 9, 3, 6, 11, 3, 6};
        int min = values[0], max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }

            if (values[i] > max) {
                max = values[i];
            }
        }

        System.out.printf("Минимальное: %d, Максимальное: %d%n", min, max);
    }

    // вероятно, это не самое оптимальное решение, как можно еще?
    private static boolean checkArrayBalance(int[] data) {
        int leftSum = 0, totalSum = 0;

        for (int element : data) {
            totalSum += element;
        }

        for (int element : data) {
            leftSum += element;

            if (totalSum - leftSum == leftSum) {
                return true;
            }
        }

        return false;
    }
}
