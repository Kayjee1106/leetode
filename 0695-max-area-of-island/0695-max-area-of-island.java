class Solution {
    int m=0,n=0;
    int [][] directions={{0,1},{1,0},{0,-1},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int area=0;
        if(m*n<1){
            return 0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1) {
                area=Math.max(area,find(grid,i, j));
                }
            }
        }
        return area;
    }
    private int find(int[][] grid,int i,int j){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] ==0)return 0;
        int currArea=1;
        grid[i][j]=0;
        for(int [] dir :directions){
            int x=i+dir[0];
            int y=j+dir[1];
            currArea+=find(grid,x,y);
        }
        
        return currArea;
    }
}