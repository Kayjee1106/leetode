class Solution {
    int dp[][];
    private boolean solve(String s, int i,int j){
        if(i>=j){
            return true;
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= solve(s,i+1,j-1)? 1:0;
        }
        else{
          dp[i][j]=0;  
        }
        return dp[i][j]==1;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int max=0;
        int sp=0;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)){
                    if(j-i+1>max){
                        max=j-i+1;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+max);
    }
}