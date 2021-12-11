package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + multiply(s) + minus(s) + divide(s);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int min = minus(10);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int div = calculator.divide(5);
        int sum = calculator.sumAllOperation(5);
    }
}
