class Solution {
    private boolean solve(int[] piles,int x,int h){
        int ans=0;
        for(int pile:piles){
            ans+=pile/x;
            if(pile%x!=0){
                ans++;
            }
        }
        return ans<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r= Arrays.stream(piles).max().getAsInt();
        while(l<r){
            int mid=l+(r-l)/2;
            if(solve(piles,mid,h)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}