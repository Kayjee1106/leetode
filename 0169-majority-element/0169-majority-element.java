class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 == 1) {
            return nums[nums.length / 2];
        } else {
            return nums[nums.length / 2 - 1];
        }
    }
}