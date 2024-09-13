class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int x=arr[start];
            while(start<end){
                x=x^arr[start+1];
                start++;
            }
            ans[i]=x;
        }
        return ans;
    }
}