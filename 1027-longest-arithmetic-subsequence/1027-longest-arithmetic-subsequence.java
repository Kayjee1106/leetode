class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        int[][] t=new int[n][1001];
        if(n<=2)return n;
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int diff=nums[i]-nums[j]+500;
                t[i][diff]=t[j][diff]>0?t[j][diff]+1:2;
                result=Math.max(result,t[i][diff]);
            }
        }
        return result;
    }
}