class Solution {
    int result;
    int K;
    public int beautifulSubsets(int[] nums, int k) {
        result=0;
        K=k;
        HashMap<Integer,Integer> map=new HashMap<>();
        solve(0,nums,map);
        return result-1;
    }
    void solve(int idx,int[] nums,HashMap<Integer,Integer> map){
        if(idx==nums.length){
            result++;
            return;
        }
        solve(idx+1,nums,map);
        if(!map.containsKey(nums[idx]-K)&&!map.containsKey(nums[idx]+K)){
            map.put(nums[idx], map.getOrDefault(nums[idx], 0) + 1);
            solve( idx + 1,nums, map);
            map.put(nums[idx], map.get(nums[idx]) - 1);
            if (map.get(nums[idx]) == 0) {
                map.remove(nums[idx]);
            }
        }
    }
}