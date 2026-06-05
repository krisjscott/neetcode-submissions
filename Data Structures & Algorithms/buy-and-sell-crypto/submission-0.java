class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_prices = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            // max_profit = prices[i];
            if(prices[i]<min_prices){
                min_prices = prices[i];
            }
            int profit = prices[i] - min_prices;
            max_profit = Math.max(max_profit, profit);

        }
        return max_profit;
    }
}
