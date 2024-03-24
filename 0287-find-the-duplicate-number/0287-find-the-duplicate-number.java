class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n]; 
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[nums[i] - 1]) {
                return nums[i];
            } else {
                visited[nums[i] - 1] = true;
            }
        }
        return -1; 
    }
}
