package org.example.DSA;


/*
Can you solve Move Zeroes using the two-pointer technique and
perform the movement in a single traversal?
*/


public class MoveZeroesTwoPointer {
    public static void main(String[] args) {
        int[] nums = {5, 1, 0, 3, 12};
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i:nums){
            System.out.print(i+",");
        }
    }
}
