class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            
            if (seen.contains(num) && !result.contains(num)) {
                result.add(num);
            } else {
                seen.add(num); 
            }
        }
        
        return result;
      
        }
}