class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)return 0;
        int max=nums[0];
        int curr=0;
        for(int el:nums){
            if(curr<0)curr=0;
            curr+=el;
            max=Math.max(max,curr);
        }
        return max;
    }
}