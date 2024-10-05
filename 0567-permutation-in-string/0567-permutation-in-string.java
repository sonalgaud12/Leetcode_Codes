class Solution {
    public boolean checkInclusion(String s1, String s2) {
int n = s1.length();
        int m = s2.length();
        
        if (n > m) {
            return false;
        }

       
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        
        
        for (int i = 0; i <= m - n; i++) { 
            String sub = s2.substring(i, i + n); 
            char[] subArray = sub.toCharArray();
            Arrays.sort(subArray);
            
            
            if (Arrays.equals(charArray, subArray)) { 
                return true;
            }
        }
        return false;
    }
}