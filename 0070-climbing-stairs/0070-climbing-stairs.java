class Solution {
    int solve(int n,int[] memo){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        int one=solve(n-1,memo);
        int two=solve(n-2,memo);
        return memo[n]=one+two;
        
    }
    public int climbStairs(int n) {
        int [] memo=new int[46];
        Arrays.fill(memo,-1);
        return solve(n,memo);
    }
}