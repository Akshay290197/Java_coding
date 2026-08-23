package org.example.java_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 20, 15, 10);
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighest);
    }
}
