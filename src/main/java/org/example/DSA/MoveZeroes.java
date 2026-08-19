package org.example.DSA;

import java.util.List;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            nums[count]= nums[i];
            count++;
        }
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
        for(int i : nums){
            System.out.print(i+",");
        }
    }
}
