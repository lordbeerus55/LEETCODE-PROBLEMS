class Solution {
    public int maxProfit(int[] prices) {
       int start = 0 ;
       int maxProfit=0;
       
       int length=prices.length;
       for(int end = 0 ; end<length;end++){
        if(prices[start]<prices[end]){
            maxProfit=Math.max(maxProfit,prices[end]-prices[start]);
        }
        else{
            start=end;
        }
       }
       return maxProfit;
        
    }
}