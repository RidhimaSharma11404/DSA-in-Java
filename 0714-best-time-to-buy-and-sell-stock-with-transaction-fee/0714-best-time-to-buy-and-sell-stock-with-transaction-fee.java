class Solution {
    public int maxProfit(int[] prices, int fee) {

        int buy = -prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {

            int buy1 = Math.max(buy, sell - prices[i]);

            int sell1 = Math.max(sell, buy + prices[i] - fee);

            buy = buy1;
            sell = sell1;
        }

        return sell;
    }
}