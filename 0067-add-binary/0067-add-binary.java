class Solution {
    public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
        int carry=0;
        
        int s1 = a.length();
        int s2 = b.length();
        int max = Math.max(s1, s2);
        
        for(int i=0;i<max;i++){
            int b1= (i<s1) ? a.charAt(s1-i-1)-'0' : 0;
            int b2 = (i<s2) ? b.charAt(s2-i-1)-'0': 0;
            
            int sum = b1+b2+carry;
            carry= sum/2;
            result.append(sum%2);
            
        }
            
            if(carry!=0){
                result.append(carry);
            }
            
            
        return result.reverse().toString();
    }
}