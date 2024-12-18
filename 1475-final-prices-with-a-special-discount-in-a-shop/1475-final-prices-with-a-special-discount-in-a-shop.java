class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int arr[] = new int[n];
        int i=0;
        
        while(i<n){
            int j = i+1;
            arr[i] = prices[i];
            
            while(j<n){
                
                if(prices[i] >= prices[j]){
                    arr[i] = prices[i]-prices[j];
                    break;
                }
                j++;
                
            }
            i++;
        }
        
        return arr;
        
        
    }
}