func twoSum(nums []int, target int) []int {
    res := make([]int, 2)
    mp := make(map[int]int)
    
    for i:= 0; i< len(nums);i++{
        cp := target - nums[i]
        
        if index, found := mp[cp]; found{
            res[0] =i
            res[1] = index
            return res
        }
        mp[nums[i]] = i
    }
    return res
}