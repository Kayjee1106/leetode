class Solution {
    public boolean checkIfPangram(String sentence) {
        String s=sentence;
        boolean arr[]=new boolean[26];
        int index;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if('a'<=c &&c<='z'){
                index=c-'a';
            }
            else if('A'<=c && c<='Z'){
                index=c-'A';
            }
            else{
                continue;
            }
            arr[index]=true;
        }
        for(boolean val:arr){
            if(!val){
                return false;
            }
        }
        return true;
    }
}