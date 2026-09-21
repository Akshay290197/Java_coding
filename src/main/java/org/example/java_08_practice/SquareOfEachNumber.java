package org.example.java_08_practice;


import java.util.Arrays;
import java.util.List;

/*
Square of Each Number (Basic)
Use Java 8 Stream API to create a new list containing the square of each number.
* */
public class SquareOfEachNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> newList = numbers.stream().map(n->n*n).toList();
        System.out.println(newList);
    }
}
