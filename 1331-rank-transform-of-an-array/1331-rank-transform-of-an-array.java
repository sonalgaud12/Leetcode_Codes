class Solution {
    public int[] arrayRankTransform(int[] arr) {
         Map<Integer, Integer> r = new HashMap<>();  
        int[] nm = Arrays.stream(arr).distinct().sorted().toArray();  
        
        
        for (int i = 0; i < nm.length; i++) {
            r.put(nm[i], i + 1);
        }

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.get(arr[i]);
        }

        return arr;
    }
}