package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = (x1 - x2) + (y1 - y2);
        double second = Math.pow(first, 2);
        double three = Math.sqrt(second);
        return three;
    }

    public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            System.out.println("result (0, 0) to (2, 0) " + result);
            double result1 = Point.distance(1, 1, 3, 1);
            System.out.println("result (1, 1) to (3, 1) " + result1);
    }
}
