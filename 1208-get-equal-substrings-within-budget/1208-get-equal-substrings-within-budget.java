class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
       int n=s.length();
        int curr=0;
        int max=0;
        int i=0,j=0;
        while(j<n){
            curr+=Math.abs(s.charAt(j)-t.charAt(j));
            while(curr>maxCost){
                curr-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
