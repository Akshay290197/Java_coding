package org.example.java_08;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n->!seen.add(n))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(duplicates);
    }
}
