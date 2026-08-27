package org.example.DSA;

/*
Ques -
Given: int[] prices = {7, 1, 5, 3, 6, 4};
prices[i] represents the price of a stock on day i.
You can buy once and sell once.
Return the maximum profit you can achieve.
Can you solve this in O(n) time and O(1) space?
*/


public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 5, 3, 6, 4, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i]-minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
