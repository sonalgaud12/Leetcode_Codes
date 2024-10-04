class Solution {
    public long dividePlayers(int[] skill) {
          long sum=0;
        int n= skill.length;
        for(int i=0;i<n;i++){
            sum += skill[i];
        }
        Arrays.sort(skill);
        
        if(sum%(n/2) !=0) return -1;
        
        long temp=sum/(n/2);
        sum=0;
        for(int i=0;i<n/2;i++){
            if(skill[i]+skill[n-1-i]!= temp){
                return -1;
            }else{
                sum+=(skill[i]*skill[n-1-i]);
            }
        }
        return sum;
    }
}

