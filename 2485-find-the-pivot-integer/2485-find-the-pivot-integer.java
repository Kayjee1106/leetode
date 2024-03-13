class Solution {
    public int pivotInteger(int n) {
        double sum=(n*(n+1))/2;
        double x=Math.sqrt(sum);
        if(x==Math.floor(x)){
            return (int)x;
        }
        else{
            return -1;
        }
    }
}