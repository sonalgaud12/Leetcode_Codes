class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int n= nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum=0;
        mp.put(0,1);
        int res=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            
            int rem=sum%k;
            
            if(rem < 0){
                rem +=k;
            }
            
            if(mp.containsKey(rem)){
                res += mp.get(rem);
            }
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }
        
        return res;
    }
}

