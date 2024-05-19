package bestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 2 && prices[0] < prices[1]) {
            return prices[1] - prices[0];
        }

        int difference = 0;
        int minimumPriceIndex = 0;

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[minimumPriceIndex]) {
                minimumPriceIndex = i;
            }
            if (prices[i] - prices[minimumPriceIndex] > difference) {
                difference = prices[i] - prices[minimumPriceIndex];
            }
        }
        return difference;
    }
}
