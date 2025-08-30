public class BuySell {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];   // minimum price seen so far
        int maxProfit = 0;         // maximum profit so far

        for (int i = 1; i < prices.length; i++) {
            // if today’s price is greater than bestBuy → we can sell
            if (prices[i] > bestBuy) {
                int profit = prices[i] - bestBuy;   // profit if we sell today
                maxProfit = Math.max(maxProfit, profit);
            }

            // always update bestBuy with the lowest price seen so far
            bestBuy = Math.min(bestBuy, prices[i]);
        }

        return maxProfit;
    }
}
