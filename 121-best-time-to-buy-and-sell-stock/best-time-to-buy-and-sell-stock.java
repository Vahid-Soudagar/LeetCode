class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price if the current price is lower
            minPrice = Math.min(minPrice, prices[i]);

            // Update the maximum profit if selling at the current price gives a better profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
