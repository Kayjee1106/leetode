class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int[] ans1 = new int[]{-1, -1};
        int firstIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                firstIndex = i;
                break;
            }
        }
        if (firstIndex == -1) {
            return ans1;
        }
        int lastIndex = -1;
        for (int i = firstIndex; i < nums.length; i++) {
            if (nums[i] != target) {
                lastIndex = i - 1;
                break;
            }
            if (i == nums.length - 1) {
                lastIndex = i;
            }
        }
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }
}
