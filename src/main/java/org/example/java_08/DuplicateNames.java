package org.example.java_08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Akshay","Aman","Rohit","Aman","Sumit","Akshay"
        );
        Set<String> nameList = new HashSet<>();
        List<String> duplicates = names.stream()
                .filter(name -> !nameList.add(name))
                .toList();
        System.out.println(duplicates);
    }

}
