package org.example.java_08_practice;

import java.util.Arrays;
import java.util.List;


/*
* Find the Sum of All Numbers (Basic–Intermediate)
* Use Java 8 Stream API to calculate the sum of all numbers using mapToInt() and sum()
* */
public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
