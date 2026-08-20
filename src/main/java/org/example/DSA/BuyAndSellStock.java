package org.example.DSA;

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
