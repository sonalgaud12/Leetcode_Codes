class Solution {
    public void twoSum(int nums[],int k, List<List<Integer>> list,int target){
        
        int i=k, j=nums.length-1;
        
        while(i<j){
            if(nums[i] + nums[j] > target){
                j--;
            }else if(nums[i] + nums[j] < target){
                i++;
            }else{
                list.add(Arrays.asList(-target, nums[i], nums[j]));
                
                while(i < j && nums[i] == nums[i+1]){
                    i++;
                }
                while(i<j && nums[j] == nums[j-1]){
                    j--;
                }
                i++;
                j--;
            }
        }
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list = new ArrayList<>();
      int n=nums.length;
        
        if(n<3){
            return list;
        }
        Arrays.sort(nums);
        
        for(int i=0; i<n-2;i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            twoSum(nums, i+1, list, -nums[i]);
        }
        return list;
    
    }
}