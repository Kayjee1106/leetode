class Solution {
    public int countSquares(int[][] matrix) {
        int sum=0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            dp[i][matrix[0].length-1]=matrix[i][matrix[0].length-1];
        }
        for(int j=0;j<matrix[0].length;j++){
            dp[matrix.length-1][j]=matrix[matrix.length-1][j];
        }
        for(int i=matrix.length-2;i>=0;i--){
            for(int j=matrix[0].length-2;j>=0;j--){
                if(matrix[i][j]==0)dp[i][j]=0;
                else{
                    int min=Math.min(dp[i+1][j],dp[i][j+1]);
                    min=Math.min(dp[i+1][j+1],min);
                    dp[i][j]=min+1;
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                sum+=dp[i][j];
            }
        }
        return sum;
    }
}