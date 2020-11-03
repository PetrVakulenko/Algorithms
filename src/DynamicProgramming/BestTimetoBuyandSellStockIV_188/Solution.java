package DynamicProgramming.BestTimetoBuyandSellStockIV_188;

/**
 188. Best Time to Buy and Sell Stock IV

 You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 Design an algorithm to find the maximum profit. You may complete at most k transactions.
 Notice that you may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 Example 1:
 Input: k = 2, prices = [2,4,1]
 Output: 2
 Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.

 Example 2:
 Input: k = 2, prices = [3,2,6,5,0,3]
 Output: 7
 Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4. Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.

 Constraints:
 0 <= k <= 109
 0 <= prices.length <= 104
 0 <= prices[i] <= 1000
 */

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;

        if (k + k > n) {
            int res = 0;
            for (int i = 1; i < n; i++) {
                res += Math.max(0, prices[i] - prices[i-1]);
            }

            return res;
        }

        int[][][] dp = new int[2][k + 1][2];

        for (int i = 0; i < 2; i++) {
            dp[i][0][0] = Integer.MIN_VALUE;
        }

        for (int j = 0; j <= k; j++) {
            dp[0][j][0] = Integer.MIN_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            int cur = i & 1;
            int prev = cur ^ 1;

            for (int j = 1; j <= k; j++) {
                dp[cur][j][0] = Math.max(Math.max(dp[prev][j][0], dp[cur][j-1][0]), dp[prev][j-1][1] - prices[i-1]);
                dp[cur][j][1] = Math.max(Math.max(dp[prev][j][1], dp[cur][j-1][1]), dp[prev][j][0] + prices[i-1]);
            }
        }

        return dp[n & 1][k][1];
    }
}
