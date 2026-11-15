package org.example.java_08;

import java.util.Arrays;
import java.util.List;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Akshay", "Aman", "Rohit", "Sumit", "Ankit", "Amit"
        );
        names.stream().sorted().limit(3).forEach(System.out::println);
    }
}
