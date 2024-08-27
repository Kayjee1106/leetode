class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] ans=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            if(citations[i]<n){
                ans[citations[i]]++;
            }
            else{
                ans[n]++;
            }
        }
        for(int i=n;i>=0;i--){
            count+=ans[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}