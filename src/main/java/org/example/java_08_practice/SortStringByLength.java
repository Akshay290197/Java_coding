package org.example.java_08_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/*
Sort Strings by Length (Intermediate)
Use Java 8 Stream API to sort the strings by their length in ascending order and collect the result into a new list.
* */
public class SortStringByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "API", "Microservices", "SQL");
        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }
}
