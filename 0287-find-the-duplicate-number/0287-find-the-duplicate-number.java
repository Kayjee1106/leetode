class Solution {
    public int findDuplicate(int[] nums) {
//         int n = nums.length;
//         int x=nums[0]
//         // boolean[] visited = new boolean[n]; 
//         // Arrays.fill(visited, false);
//         // for (int i = 0; i < n; i++) {
//         //     if (visited[nums[i] - 1]) {
//         //         return nums[i];
//         //     } else {
//         //         visited[nums[i] - 1] = true;
//         //     }
//         // }
//         for(int i=0;i<n;i++){
//             x=x^nums[i];
            
//         }
//         return -1; 
         for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i]);
            if(nums[ind] < 0) {
                return ind;
            }
            nums[ind] = -nums[ind];
        }
        return -1;
    }
}
