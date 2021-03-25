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
}
