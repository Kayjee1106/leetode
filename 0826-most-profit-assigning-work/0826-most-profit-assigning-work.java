class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;
        int[][] vec = new int[n][2];
        for (int i = 0; i < n; i++) {
            vec[i][0] = difficulty[i];
            vec[i][1] = profit[i];
        }
        Arrays.sort(vec, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);
        int tp=0;
        int j=0;
        int mp=0;
        for(int i=0;i<m;i++){
            while(j<n&&worker[i]>=vec[j][0]){
                mp=Math.max(mp,vec[j][1]);
                j++;
            }
            tp+=mp;
        }
        return tp;
    }
}