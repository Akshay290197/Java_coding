package org.example.java_08;

import java.util.Arrays;
import java.util.List;

public class MAxAndMinNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int max = numbers.stream().max(Integer::compareTo).get();
        int min = numbers.stream().min(Integer::compareTo).get();
        System.out.println(max+":"+min);
    }
}
