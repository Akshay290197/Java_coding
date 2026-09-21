package org.example.java_08_practice;

import java.util.Arrays;
import java.util.List;

/*
Filter Even Number From List
* */
public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
