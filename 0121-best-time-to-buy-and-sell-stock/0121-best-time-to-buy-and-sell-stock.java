class Solution {
    public int maxProfit(int[] prices) {
        int minimum =  Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0 ; i <prices.length;i++){
            if(prices[i]<minimum){
                minimum = prices[i];
            }
            else if(prices[i] - minimum >max_profit){
                max_profit=prices[i] - minimum;
            }

            
        }
        return max_profit;
        
    }
}