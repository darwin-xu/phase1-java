package com.example.ext.polymorphism;

public class DispatchDemo {
    public static void main(String[] args) {
        Calculator calc = new LoggingCalculator();

        System.out.println(calc.describe());
        System.out.println(calc.add(3, 4));
        System.out.println(calc.add(2.5, 1.5));

        LoggingCalculator direct = new LoggingCalculator();
        direct.add(3, 4, true);
    }
}