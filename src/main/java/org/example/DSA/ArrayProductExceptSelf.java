package org.example.DSA;


/*
Product of Array Except Self
Return an array where:
result[i] = product of all elements of nums except nums[i]
Can you solve it in O(n) time?
Can you do it with O(1) extra space, excluding the output array?
*/
public class ArrayProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            int mul = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j) {
                    mul *= nums[j];
                }
            }
            res[i]=mul;
        }
        for(int i:res){
            System.out.print(i+",");
        }
    }
}
