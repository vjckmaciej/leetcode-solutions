class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minimum) {
                minimum = prices[i];
            } else {
                int profit = prices[i] - minimum;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}