class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flips = 0;
        int flipCountFromPastForCurri = 0;
        for (int i = 0; i < n; i++) {
            if (i >= k && nums[i - k] == 2) {
                flipCountFromPastForCurri--;
            }
            if (flipCountFromPastForCurri % 2 == nums[i]) {
                if (i + k > n) {
                    return -1;
                }
                flipCountFromPastForCurri++;
                nums[i] = 2;
                flips++;
            }
        }
        return flips;
    }
}