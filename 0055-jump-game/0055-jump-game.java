class Solution {
    public boolean canJump(int[] nums) {
        int coverage = 0;
        int n = nums.length;
        for (int i=0; i<n; i++) {
            if (i>coverage) {
                return false; 
            }
            coverage= Math.max(coverage, i + nums[i]);
            if (coverage>=n-1){
                return true; 
            }
        }
        return false;   
    }
}