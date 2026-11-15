package org.example.java_08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NamesFrequency {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Akshay", "Aman", "Rohit", "Sumit", "Aman", "Akshay"
        );

        names.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )
        ).entrySet().forEach(System.out::println);
    }
}
