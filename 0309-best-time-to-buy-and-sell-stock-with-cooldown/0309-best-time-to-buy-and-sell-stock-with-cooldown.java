class Solution {
    public int maxProfit(int[] prices) {

        int buy = -prices[0];
        int sell = 0;
        int cooldown = 0;

        for (int i = 1; i < prices.length; i++) {

            int buy1 = Math.max(buy, cooldown - prices[i]);

            int sell1 = Math.max(sell, buy + prices[i]);

            int cooldown1 = Math.max(cooldown, sell);

            buy = buy1;
            sell = sell1;
            cooldown = cooldown1;
        }

        return Math.max(sell, cooldown);
    }
}