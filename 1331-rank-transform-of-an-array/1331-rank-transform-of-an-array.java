class Solution {
    public int[] arrayRankTransform(int[] arr) {
         Map<Integer,Integer> store = new HashMap<>();
        int[] sortt = Arrays.stream(arr).distinct().sorted().toArray();
        
        for(int i=0;i<sortt.length;i++){
            
            store.put(sortt[i],i+1);
            
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = store.get(arr[i]);
        }
        
        return arr;
    }
}