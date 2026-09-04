package org.example.java_08;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepChar {
    public static void main(String[] args) {
        String str = "swiss";
        Character res = str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(n->n.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(res);
    }
}
