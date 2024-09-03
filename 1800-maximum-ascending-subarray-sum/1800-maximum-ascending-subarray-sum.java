class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int max=sum;
        int i=1;
        while(i<nums.length){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
            }
            else{
                sum=nums[i];
            }
            max=Math.max(max,sum);
            i++;
        }
        return max;
    }
}