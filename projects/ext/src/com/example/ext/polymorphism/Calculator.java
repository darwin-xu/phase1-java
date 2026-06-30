package com.example.ext.polymorphism;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String describe() {
        return "Basic calculator";
    }
}