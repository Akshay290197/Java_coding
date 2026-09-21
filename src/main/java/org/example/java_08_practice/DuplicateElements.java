package org.example.java_08_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Find Duplicate Elements (Basic–Intermediate)
Use Java 8 Stream API to find and print all duplicate elements from the list.
* */
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 50, 10, 30, 60);
        Set<Integer> set = new HashSet<>();
        numbers.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}
