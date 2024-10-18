func maxProfit(prices []int) int {
    if len(prices)==0{
        return 0
    }
    
    max := 0
    sell := prices[0]
    buy := prices[0]
    
    for i:=0; i<len(prices);i++{
        buy = int(math.Min(float64(buy),float64(prices[i])))
        sell = int(math.Max(float64(buy), float64(prices[i])))
        max = int(math.Max(float64(max), float64(sell-buy)))
    }
    
    return max
    
}