class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private Set<Integer> st = new HashSet<>();
    int n;
    
    public void solve(List<Integer> temp, List<Integer> nums){
        if(temp.size() == n){
            result.add(new ArrayList<>(temp)); // add new list to avoid refernce
            return;
        }
        
        for(int i=0;i<n;i++){
            if(!st.contains(nums.get(i))){
                temp.add(nums.get(i));
                st.add(nums.get(i));
                
                solve(temp, nums);
                
                st.remove(nums.get(i));
                temp.remove(temp.size()-1);
                
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        n = nums.length;
        List<Integer> temp = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        
        for(int num: nums){
            numList.add(num);
        }
        solve(temp, numList);
        return result;
    }
}