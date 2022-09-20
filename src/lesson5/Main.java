package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(12345));
        System.out.println(getPercent(24));
        System.out.println(isSimple(8));
        System.out.println(factorial(5));
    }

    /**
     * Найти сумму всех чисел числа
     */
    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

    public static double getPercent(int initSum) {
        double result = initSum;
        for (int year = 1626 + 1; year <= 2020; year++) {
            double percent = result * 0.05;
            result += percent;
        }
        return result;
    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        while (value > 0) {
            result *= value--;
            factorial(value);
        }
        return result;
    }
}
