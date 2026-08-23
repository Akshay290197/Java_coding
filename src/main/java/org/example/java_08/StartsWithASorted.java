package org.example.java_08;

import java.util.Arrays;
import java.util.List;

public class StartsWithASorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Akshay", "Aman", "Rohit", "Amit", "Sumit", "Ankit"
        );
        List<String> res = names.stream().filter(n->n.startsWith("A"))
                .sorted().toList();
        System.out.println(res);
    }
}
