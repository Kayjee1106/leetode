class Solution {
    int[][]t;
    public int longestCommonSubsequence(String text1, String text2) {
        t=new int[1001][1001];
        int m=text1.length();
        int n=text2.length();
        for(int i=0;i<1001;i++){
            Arrays.fill(t[i],-1);
        }
        return solve(text1,text2,m,n,0,0);
    }
    public int solve(String text1, String text2,int m,int n,int i,int j){
        if(i>=m ||j>=n){
            return 0;
        }
        if(t[i][j]!=-1)return t[i][j];
        if(text1.charAt(i)==text2.charAt(j))return t[i][j]=1+solve(text1,text2,m,n,i+1,j+1);
        return t[i][j]=Math.max(solve(text1,text2,m,n,i+1,j),solve(text1,text2,m,n,i,j+1));
    }
}