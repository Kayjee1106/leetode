class Solution {
    public int jump(int[] nums) {
    int jumps = 0;
    int coverage = 0;
    int x = 0;
    int destination = nums.length - 1;

    if (nums.length == 1) {
        return 0;
    }

    for (int i=0; i<nums.length; i++) {
        coverage=Math.max(coverage, i+nums[i]);
        if (i==x){
            x=coverage;
            jumps++;
        if(coverage>=destination){
            return jumps;
        }
        }
    }
    return jumps;
    }
}