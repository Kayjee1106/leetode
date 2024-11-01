class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=0;
        Set<Character> set=new HashSet<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(!(set.contains(s.charAt(i)))){
                set.add(s.charAt(i));
                maxi=Math.max(maxi,i-j+1);
            }
            else{
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
        }
        return maxi;
    }
}