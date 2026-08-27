package org.example.InterviewCodingPractice;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 30);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
