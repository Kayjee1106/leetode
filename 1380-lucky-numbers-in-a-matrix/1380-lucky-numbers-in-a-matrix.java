class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        int[] colmax=new int[n];
        int[] rowmin=new int[m];
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int row=0;row<m;row++){
                max=Math.max(max,matrix[row][i]);
            }
            colmax[i]=max;
        }
        for(int j=0;j<m;j++){
            int min=Integer.MAX_VALUE;
            for(int col=0;col<n;col++){
                min=Math.min(min,matrix[j][col]);
            }
            rowmin[j]=min;
        }
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(matrix[row][col]==rowmin[row] && matrix[row][col]==colmax[col]){
                    ans.add(matrix[row][col]);
                }
            }
        }
        return ans;
    }
}