class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int down=m-1;
        int left=0;
        int right=n-1;
        int x=0;
        while(top<=down && left<=right){
            if(x==0){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            if(x==1){
                for(int i=top;i<=down;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(x==2){
                for(int i=right;i>=left;i--){
                    result.add(matrix[down][i]);
                }
                down--;
            }
            if(x==3){
                for(int i=down;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
             x=(x+1)%4;
        }
        return result;
    }
}