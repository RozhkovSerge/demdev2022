package home_work1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 */

public class Task3 {
    public static void main(String[] args) {
        compareTriangles(11,3,5,6);
    }

    public static double getTriangleSquare(int a, int b) {
        return (a * b) / 2;
    }

    public static void compareTriangles(int a1, int b1, int a2, int b2) {
        double square1 = getTriangleSquare(a1, b1);
        double square2 = getTriangleSquare(a2, b2);

        if (square1 > square2) {
            System.out.println("Треугольник 1 больше");
        } else if (square1 < square2) {
            System.out.println("Треугольник 2 больше");
        } else {
            System.out.println("Треугольники равны");
        }
    }
}
