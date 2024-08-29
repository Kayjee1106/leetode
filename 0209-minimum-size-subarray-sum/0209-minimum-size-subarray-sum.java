class Solution {
    public int sum(int[]arr,int i,int j){
        int sum=0;
        for(int k=i;k<j+1;k++){
            sum+=arr[k];
        }
        return sum;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int start=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}