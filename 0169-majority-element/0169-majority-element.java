class Solution {
    public int majorityElement(int[] nums) {
        int a=nums.length/2;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
               int x=mp.get(nums[i]);
                x++;
                mp.put(nums[i],x);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> s: mp.entrySet()){
            if(s.getValue()>a){
                return s.getKey();
            }
        }
        return 0;
    }
}