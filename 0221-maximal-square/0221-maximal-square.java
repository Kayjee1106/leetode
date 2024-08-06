class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int maxSquareLength = 0;

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    if (i == rows - 1 || j == cols - 1) {
                        dp[i][j] = 1; // Base case for the last row or column
                    } else {
                        int min = Math.min(dp[i + 1][j], dp[i][j + 1]);
                        min = Math.min(min, dp[i + 1][j + 1]);
                        dp[i][j] = min + 1;
                    }
                    maxSquareLength = Math.max(maxSquareLength, dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }

        return maxSquareLength * maxSquareLength;
    }
}
