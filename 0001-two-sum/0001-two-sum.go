func twoSum(nums []int, target int) []int {
    res := make([]int, 2) // array
    mp := make(map[int]int) // map
    
    for i:= 0; i< len(nums);i++{
        cp := target - nums[i] // getting the complement 
        
        if index, found := mp[cp]; found{ // checking if the complement avaliable in the map
            res[0] =i // if yes then i will be stored 0 , 1 index of res
            res[1] = index
            return res
        }
        mp[nums[i]] = i // if not found then stored in the map
    }
    return res
}