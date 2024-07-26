class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        sum=lsum;
        int rindex=cardPoints.length-1;
         for (int i = 0; i < k; i++) {
            lsum -= cardPoints[k - 1 - i]; 
            rsum += cardPoints[rindex - i]; 
            sum = Math.max(sum, lsum + rsum); 
        }
        return sum;
    }
}