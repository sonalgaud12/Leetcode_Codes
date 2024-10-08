class Solution {
    public int maxProfit(int[] prices) {
      int max=0;
        int buy=prices[0];
        int sell=prices[0];
        
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy, prices[i]); // 1
            sell = Math.max(buy, prices[i]); //6
            
            max = Math.max(max, (sell-buy));
        }
        return max;
    }
}

