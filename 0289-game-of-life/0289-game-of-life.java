class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] clone = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                clone[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int live = findLive(i, j, clone);
                if (clone[i][j] == 1) {
                    if (live < 2 || live > 3) {
                        board[i][j] = 0;
                    }
                } else {
                    if (live == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
    private int findLive(int i, int j, int[][] board) {
        int live = 0;
        int[] directions = {-1, 0, 1};
        for (int x : directions) {
            for (int y : directions) {
                if (x == 0 && y == 0) continue;
                int ni = i + x;
                int nj = j + y;
                if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length && board[ni][nj] == 1) {
                    live++;
                }
            }
        }
        return live;
    }
}
