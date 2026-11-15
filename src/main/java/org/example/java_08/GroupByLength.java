package org.example.java_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Akshay", "Aman", "Rohit", "Sumit", "Ankit", "Amit"
        );
        names.stream().collect(Collectors.groupingBy(String::length))
                .forEach((a,b)-> System.out.println(a+":"+b));
    }
}
