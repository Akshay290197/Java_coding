package org.example.prac_01;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        Set<Integer> res = duplicateElements(arr);
        System.out.println(res);
    }
    public static Set<Integer> duplicateElements(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                duplicates.add(i);
            }
        }

        return duplicates;
    }
}
