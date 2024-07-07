class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int rem=0;
        int rem1=0;
        while(numBottles>=numExchange){
            rem+=numBottles%numExchange;
            ans+=numBottles/numExchange;
            numBottles/=numExchange;
        }
        while(rem+numBottles>=numExchange){
            rem1=rem+numBottles;
            ans+=rem1/numExchange;
            rem=rem1%numExchange;
            numBottles=rem1/numExchange;
            }
        return ans;
    }
}