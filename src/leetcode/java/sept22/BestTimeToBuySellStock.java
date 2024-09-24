package leetcode.java.sept22;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1398415867/
 */
public class BestTimeToBuySellStock {

    /**
     * Use kadane's algorithm
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        return maxProfit;
    }

}
