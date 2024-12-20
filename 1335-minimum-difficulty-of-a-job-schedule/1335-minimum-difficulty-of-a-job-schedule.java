public class Solution {
    int[][]t;
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d){
            return -1;
        }
         t =new int[n][d + 1];
        for (int[] row : t){
            Arrays.fill(row,-1);
        }
        return solve(jobDifficulty, n, 0, d);
    }
    private int solve(int[] jobDifficulty,int n,int idx,int d){
        if(d==1){
            return Arrays.stream(Arrays.copyOfRange(jobDifficulty, idx, n)).max().orElse(Integer.MIN_VALUE);
        }
        if(t[idx][d]!=-1){
            return t[idx][d];
        }
        int max=Integer.MIN_VALUE;
        int result=Integer.MAX_VALUE;
        for(int i=idx;i<=n-d;i++){
            max=Math.max(max,jobDifficulty[i]);
            result=Math.min(result,max+solve(jobDifficulty,n,i+1,d-1));
        }
        return t[idx][d]=result;
    }
}