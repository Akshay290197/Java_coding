package org.example.DSA;

import java.util.HashSet;
import java.util.Set;

 //Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element is distinct.

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
