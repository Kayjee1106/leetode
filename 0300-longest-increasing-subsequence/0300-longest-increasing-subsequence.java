class Solution {
    int[] t;
    int n;
    public int lengthOfLIS(int[] nums) {
        int t[]=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(t[i]<t[j]+1){
                        t[i]=t[j]+1;
                    }
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(t[i]>t[max]){
                max=i;
            }
        }
        return t[max]+1;
    //     t=new int[2501];
    //     Arrays.fill(t,-1);
    //     n=nums.length;
    //     return solve(nums,0,-1);
 }
    // public int solve(int []nums,int i,int p){
    //     if(i>=n){
    //         return 0;
    //     }
    //     if(t[i]!=-1){
    //         return t[i];
    //     } 
    //     int take=0;
    //     if(nums[i]>nums[p]){
    //         take=1+solve(nums,i+1,i);
    //     }
    //     int leave=solve(nums,i+1,p);
    //     return t[i]=Math.max(take,leave);
    // }
}