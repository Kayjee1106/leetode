class Solution {
    int t[];
    private int solve(int[] nums,int i){
        if(i>=nums.length)return 0;
        if(t[i]!=-1){
            return t[i];
        }
        int steal=nums[i]+solve(nums,i+2);
        int leave=solve( nums,i+1);
        return t[i]=Math.max(steal,leave);
    }
    public int rob(int[] nums) {
        t=new int[101];
        Arrays.fill(t,-1);
        return solve(nums,0);
    }
}