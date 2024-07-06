class Solution {
    public int passThePillow(int n, int time) {
        boolean r=false;
        int ans=1;
        while(time>0){
            if(!r && n>ans){
                ans++;
                time--;
            }
            else if(ans==n || ans==1){
                r=!r;
            }
            if(r){
                ans--;
                time--;
            }
            
        }
        return ans;
    }
}