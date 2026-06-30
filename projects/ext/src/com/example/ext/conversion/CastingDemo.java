package com.example.ext.conversion;

import java.util.Optional;

public class CastingDemo {
    public static Optional<String> safeUppercase(Object value) {
        if (value instanceof String) {
            String word = (String) value;
            return Optional.of(word.toUpperCase());
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        int total = 5;
        int count = 2;
        double average = (double) total / count;

        double precise = 9.8;
        int truncated = (int) precise;

        System.out.println("average=" + average);
        System.out.println("truncated=" + truncated);
        System.out.println(safeUppercase("robot").orElse("not a string"));

        Integer maybeNull = null;

        if (maybeNull != null) {
            int value = maybeNull;
            System.out.println(value);
        } else {
            System.out.println("Avoid unboxing null");
        }
    }
}