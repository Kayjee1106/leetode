class Solution {
    private static final int M=1000000007;
    private static final List<List<Integer>> adj = Arrays.asList(
        Arrays.asList(4, 6),
        Arrays.asList(6, 8),
        Arrays.asList(7, 9),
        Arrays.asList(4, 8),
        Arrays.asList(0, 3, 9),
        Arrays.asList(),
        Arrays.asList(0, 1, 7),
        Arrays.asList(2, 6),
        Arrays.asList(1, 3),
        Arrays.asList(2, 4) 
    );
        int [][] t;
    private int solve(int n,int cell){
        if(n==0)return 1;
        if(t[n][cell]!=-1){
            return t[n][cell];
        }
        int result=0;
        for(int nextCell:adj.get(cell)){
            result=(result+solve(n-1,nextCell))%M;
        }
        return t[n][cell]=result;
    }
    public int knightDialer(int n) {
        t=new int[n+1][10];
        int result=0;
        Arrays.stream(t).forEach(row -> Arrays.fill(row, -1));
        for(int i=0;i<=9;i++){
             result=(result+solve(n-1,i))%M;
        }
        return result;
    }
}