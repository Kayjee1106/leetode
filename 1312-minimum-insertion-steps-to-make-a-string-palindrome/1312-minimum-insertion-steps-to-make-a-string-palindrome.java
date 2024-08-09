class Solution {
    int n;
    int t[][];
    private int solve(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return t[i][j]=solve(s,i+1,j-1);
        }
        else{
            return t[i][j]= 1+Math.min(solve(s,i+1,j),solve(s,i,j-1));
        }
    }
    public int minInsertions(String s) {
        t=new int[501][501];
        n=s.length();
        for(int i=0;i<500;i++){
            Arrays.fill(t[i],-1);
        }
        return solve(s,0,n-1);
    }
}