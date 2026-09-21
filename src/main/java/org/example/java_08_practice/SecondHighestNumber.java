package org.example.java_08_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Find the Second-Highest Number (Intermediate)
* Use Java 8 Stream API to find the second-highest distinct number from the list.
* */
public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 50, 40);
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
