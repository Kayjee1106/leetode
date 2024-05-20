class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }
   int solve(int[] nums,int i,int Xor){
        if(i==nums.length){
            return Xor;
        }
        int include=solve(nums,i+1,nums[i]^Xor);
        int exclude=solve(nums,i+1,Xor);
        return include+exclude;
    }
}