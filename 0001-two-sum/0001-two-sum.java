class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            if(map.containsKey(remaining)){
                arr[0]=map.get(remaining);
                arr[1]=i;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}