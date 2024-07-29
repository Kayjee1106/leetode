class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return palindrome(s,left+1,right) || palindrome(s,left,right-1);
            }
        }
        return true;
    }
    private boolean palindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}