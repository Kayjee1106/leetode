class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x:map.keySet()){
            int remaining=k+x;
            if(k>0 && map.containsKey(remaining) || k==0 && map.get(remaining)>=2){
                count++;
            }
        }
        return count;
    }
}