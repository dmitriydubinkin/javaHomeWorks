package lesson1;

public class MyFirstClass {
    public static void main(String[] args) {
        // какой-либо код ошибки из 8 бит
        byte errorCode = 0x00000001;
        // небольшое отрицательное число
        short smallNumber = -28777;
        // например, идентификатор задачи
        int taskId = 22345045;
        // очень большое число
        long veryLongNumber = 700000000000L;
        // давление в кПа
        float pressure = 104.45f;
        // итоговая цена чего-либо
        double totalPrice = 254078.77;

        // символ F, записанный двумя способами
        char symbol1 = 'F';
        char symbol2 = '\u0046';

        // ссылочная переменная, строка с сообщением
        String message = "Hi, my name is Dmitriy";

        // флаг состояния, выбрано что-то или нет
        boolean isChecked = true;

        // пусть будет не выбрано
        isChecked = false;

        // пример константы, ускорение свободного падения
        final float GRAVITY_ACCELERATION = 9.8f;

        float calculateResult = calculateExpression(10,5,8,4);
        System.out.println("Результат вычисления выражения: " + calculateResult);

        if (checkSumRange(5, 7)) {
            System.out.println("Сумма чисел попадает в диапазон");
        } else {
            System.out.println("Суммa чисел не попадает в диапазон");
        }

        printNumberSign(-7);
        printNumberSign(-1);
        printNumberSign(0);
        printNumberSign(5);

        if (checkNumberSign(-8)) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static float calculateExpression(float a, float b,  float c,  float d) {
        return a * (b + (c / d));
    }

    private static boolean checkSumRange(int a, int b) {
        int rangeMin = 10, rangeMax = 20;
        int sum = a + b;
        return (sum >= rangeMin) && (sum <= rangeMax);
    }

    private static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Чилсо " + number + " положительное");
        } else {
            System.out.println("Чилсо " + number + " отрицательное");
        }
    }

    private static boolean checkNumberSign(int number) {
        // требовалось вернуть true, если число отрицательное
        // можно было !(number >= 0), но это не эстетично
        return (number < 0);
    }
}
