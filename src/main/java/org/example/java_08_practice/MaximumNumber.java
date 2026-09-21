package org.example.java_08_practice;


import java.util.Arrays;
import java.util.List;

/*
Find Maximum Number (Basic)
Use Java 8 Stream API to find the maximum number from the list.
* */
public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15, 30);
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
