class Solution {
    public int minSwaps(String s) {
       int st=0;
        
        for(char ch : s.toCharArray()){
            if(ch == '['){
                st++;
        }else if(st > 0){
            st--;
        }
    }
        
        return (st+1)/2;
    }
}