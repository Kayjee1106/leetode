class Solution {
    int[][] t;
    private int solve(int i,int j,int[]nums){
        if(i>j)return 0;
        if(i==j)return nums[i];
        if(t[i][j]!=-1){
            return t[i][j];
        }
        int takei=nums[i]+Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int takej=nums[j]+Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));
        return t[i][j]=Math.max(takei,takej);
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int sum=0;
        t=new int[n][n];
        for(int i=0;i<t.length;i++){
            Arrays.fill(t[i],-1);
        }
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int p1= solve(0,n-1,nums);
        int p2=sum-p1;
        return p1>=p2;
    }
}