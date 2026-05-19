/*
Question:
LeetCode 121 - Best Time to Buy and Sell Stock

Pattern:
Greedy / Prefix Minimum

Brute Force Approach:
Try every buy day with every future sell day.

Time Complexity: O(n²)
Space Complexity: O(1)

Optimized Approach:
1. Track minimum price seen so far
2. Calculate profit for current day
3. Update maximum profit

Optimized Complexity:
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            minPrice = Math.min(minPrice, prices[i]);

            // Calculate current profit
            int currentProfit = prices[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}