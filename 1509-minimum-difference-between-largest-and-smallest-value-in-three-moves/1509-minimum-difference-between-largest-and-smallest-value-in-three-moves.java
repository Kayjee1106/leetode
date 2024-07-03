class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
              minDiff = Math.min(minDiff, nums[nums.length - 1 - (3 - i)] - nums[i]);
        }
        return minDiff;
    }
}