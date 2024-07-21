class Solution {
    public int[] runningSum(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
            nums[i]=x;
        }
        return nums;
    }
}