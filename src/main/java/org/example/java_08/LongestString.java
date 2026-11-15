package org.example.java_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Spring", "Boot", "Microservices"
        );
        words.stream().max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
    }
}
