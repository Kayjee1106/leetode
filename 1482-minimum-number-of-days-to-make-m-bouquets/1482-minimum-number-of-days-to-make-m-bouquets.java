class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<m*k){
            return -1;
        }
        int startDay = 1;
        int endDay = Arrays.stream(bloomDay).max().getAsInt();
        int minDays = -1;
        while (startDay <= endDay) {
            int mid = startDay + (endDay - startDay) / 2;
            if(getNumberOfBouquets(bloomDay,mid,k)>=m){
                minDays = mid;
                endDay = mid - 1;
            } else {
                startDay = mid + 1;
            }
        }
        return minDays;
        }
    private int getNumberOfBouquets(int[] bloomDay,int mid,int k){
        int b=0;
        int c=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                c++;
            }
            else{
                c=0;
            }
            if(c==k){
                b++;
                c=0;
            }
        }
        return b;
    }
}