package org.example.java_08_practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
Count Frequency of Each Element (Intermediate)
Use Java 8 Stream API to count the frequency of each element and store the result in a Map<Integer, Long>.
* */
public class CountFrequencyOfEachElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30);
        numbers.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )
        ).entrySet().forEach(System.out::println);
    }
}
