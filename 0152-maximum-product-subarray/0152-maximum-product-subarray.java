// class Solution {
//     public int maxProduct(int[] nums) {
//         if(nums==null || nums.length==0)return 0;
//         int rp=1;
//         int lp=1;
//         int max=nums[0];
//         for(int i=0;i<nums.length;i++){
//             lp=(lp==0?0:lp)*nums[i];
//             rp=(rp==0?0:rp)*nums[nums.length-i-1];
//             int temp=Math.max(lp,rp);
//             max=Math.max(temp,max);
//         }
//         return max;
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int min = nums[0];
        int result = max;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            result = Math.max(result, max);
        }
        
        return result;
    }
}
