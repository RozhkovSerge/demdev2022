package home_work1;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 */

public class Task2 {
    public static void main(String[] args) {
        solution(24.4, 10.1, '+');
    }

    public static void solution(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+': {
                System.out.println(operand1 + operand2);
                break;
            }
            case '-': {
                System.out.println(operand1 - operand2);
                break;
            }
            case '*': {
                System.out.println(operand1 * operand2);
                break;
            }
            case '/': {
                System.out.println(operand1 / operand2);
                break;
            }
            default:
                System.out.println("Неверные данные");
        }
    }
}
