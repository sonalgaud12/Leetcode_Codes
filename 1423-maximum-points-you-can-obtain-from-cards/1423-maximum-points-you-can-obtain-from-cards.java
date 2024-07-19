class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
      int n = cardPoints.length;
      int sumc =0;
      int max =0;
        
        for(int i=0;i<k;i++){
            sumc += (cardPoints[i]);
        }
        
        for(int i=k-1;i>=0;i--){
            max = Math.max(max, sumc);
            sumc -= cardPoints[i];
            sumc += cardPoints[n-k+i];
        }
        max = Math.max(sumc, max);
        return max;
        
    }
}