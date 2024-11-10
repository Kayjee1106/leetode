class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        // for(int i=0;i<row;i++){
        //     Set<Integer> s=new HashSet<>();
        //     for(int j=0;j<col;j++){
        //         if(s.contains(board[i][j]))return false;
        //         s.add(board[i][j]);
        //     }
        // }
        // for(int i=0;i<col;i++){
        //     Set<Integer> s=new HashSet<>();
        //     for(int j=0;j<row;j++){
        //         if(s.contains(board[i][j]))return false;
        //         s.add(board[i][j]);
        //     }
        // }
        Set<String> s=new HashSet<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='.')continue;
                String r=(board[i][j])+"row"+Integer.toString(i);
                String c=(board[i][j])+"col"+Integer.toString(j);
                String b=(board[i][j])+"b"+Integer.toString(i/3)+Integer.toString(j/3);
                if(s.contains(r)||s.contains(c)||s.contains(b)){
                    return false;
                }
                s.add(r);
                s.add(c);
                s.add(b);
            }
        }
        return true;
    }
}