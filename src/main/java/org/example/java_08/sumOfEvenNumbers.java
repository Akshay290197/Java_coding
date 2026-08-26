package org.example.java_08;

import java.util.Arrays;
import java.util.List;

public class sumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        int sum = numbers.stream().filter(n-> n%2==0)
                .reduce((a,b)->a+b)
                .orElse(null);
        System.out.println(sum);
    }
}
