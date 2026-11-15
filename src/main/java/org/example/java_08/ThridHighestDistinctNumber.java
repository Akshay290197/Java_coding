package org.example.java_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThridHighestDistinctNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 10, 20);
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2)
                .findFirst().ifPresent(System.out::println);
    }
}
