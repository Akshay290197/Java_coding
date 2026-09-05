package org.example.java_08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
        Set<Integer> set = new HashSet<>();
        Integer res = numbers.stream()
                .filter(n->!set.add(n))
                .findFirst()
                .orElse(null);
        System.out.println(res);
    }
}
