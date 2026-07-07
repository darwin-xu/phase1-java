package com.example.ext.polymorphism;

public class LoggingCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        int result = super.add(a, b);
        System.out.println("[override] add(int, int) = " + result);
        return result;
    }

    @Override
    public String describe() {
        return "Logging calculator";
    }

    public int add(int a, int b, boolean log) {
        int result = super.add(a, b);

        if (log) {
            System.out.println("[overload] " + a + " + " + b + " = " + result);
        }

        return result;
    }
}