class Solution {
    public int minTaps(int n, int[] ranges) {
        int [] startEnd=new int[n+1];
        for(int i=0;i<ranges.length;i++){
            int start=Math.max(0,i-ranges[i]);
            int end=Math.min(n,i+ranges[i]);
            startEnd[start]=Math.max(startEnd[start],end);
        }
        int taps=0;
        int currEnd=0;
        int maxEnd=0;
        for(int i=0;i<startEnd.length;i++){
            if(i>maxEnd)return -1;
            if(i>currEnd){
                taps++;
                currEnd=maxEnd;
            }
            maxEnd=Math.max(startEnd[i],maxEnd);
        }
        return taps;
    }
}