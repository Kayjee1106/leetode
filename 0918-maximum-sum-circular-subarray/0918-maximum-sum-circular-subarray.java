class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==0)return 0;
        int max=nums[0];
        int curr_max=0;
        int curr_min=0;
        int min=nums[0];
        int sum=0;
        for(int el:nums){
            sum+=el;
            curr_max=Math.max(curr_max+el,el);
            max=Math.max(curr_max,max);
            curr_min=Math.min(curr_min+el,el);
            min=Math.min(min,curr_min);
        }
        return sum==min?max:Math.max(max,sum-min);
    }
}