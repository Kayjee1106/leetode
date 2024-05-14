class Solution {
    private int DFS(int[][] grid, int i, int j, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int originalGoldValue = grid[i][j];
        int maxGold = 0;
        maxGold = Math.max(maxGold, originalGoldValue + DFS(grid, i - 1, j, visited));
        maxGold = Math.max(maxGold, originalGoldValue + DFS(grid, i + 1, j, visited));
        maxGold = Math.max(maxGold, originalGoldValue + DFS(grid, i, j - 1, visited));
        maxGold = Math.max(maxGold, originalGoldValue + DFS(grid, i, j + 1, visited));
        visited[i][j] = false;  
        return maxGold;
    }
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxGold = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, DFS(grid, i, j, visited));
                }
            }
        }
        return maxGold;
    }
}
