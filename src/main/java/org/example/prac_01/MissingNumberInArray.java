package org.example.prac_01;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int n = arr.length+1;
        int expectedSum = n * (n+1) / 2;
        int currentSum = 0;
        for(int i:arr){
            currentSum+=i;
        }
        return expectedSum-currentSum;
    }
}
