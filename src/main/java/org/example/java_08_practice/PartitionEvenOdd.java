package org.example.java_08_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/*
* Partition Numbers into Even and Odd (Intermediate)
* Use Java 8 Stream API to partition the numbers into two groups:
*   Even numbers
*   Odd numbers
* Use Collectors.partitioningBy() and store the result in a Map<Boolean, List<Integer>>.
* */
public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even Numbers:"+map.get(true));
        System.out.println("Odd Numbers:"+map.get(false));
    }
}
