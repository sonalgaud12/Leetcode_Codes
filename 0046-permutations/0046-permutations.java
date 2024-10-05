class Solution {
    
    // Approach 2
    private List<List<Integer>> result = new ArrayList<>();
    int n;
    
    public void solve(int idx, List<Integer> nums){
        if(idx==n){
            result.add(new ArrayList(nums));
            return;
        }
        
        for(int i=idx;i<n;i++){
            
            swap(nums,i, idx);
            solve(idx+1, nums);
            swap(nums,i,idx);
            
        }
    }
    
    public void swap(List<Integer> nums,int i, int j){
        int temp= nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j,temp);
        
}
    public List<List<Integer>> permute(int[] nums) {
        
        n = nums.length;
        List<Integer> numList = new ArrayList<>();
        for(int num: nums){
            numList.add(num);
        }
        solve(0, numList);
        return result;
        
        
        
    }
}