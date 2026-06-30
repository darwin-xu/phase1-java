package com.example.ext.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApiNavigationDemo {
    public static List<String> parseTags(String csv) {
        return Arrays.stream(csv.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
            Arrays.asList("banana", "apple", "cherry")
        );

        words.sort(Comparator.naturalOrder());

        List<String> parts = parseTags("a, b, c");

        System.out.println(words);
        System.out.println(parts);
    }
}