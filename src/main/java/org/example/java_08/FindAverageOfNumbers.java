package org.example.java_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 40, 50
        );
        double avg = numbers.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println(avg);
    }
}
