class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean arr[]=new boolean[26];
        int count=0;
        for(int i=0;i<allowed.length();i++){
            arr[allowed.charAt(i)-'a']=true;
        }
        for(int i=0;i<words.length;i++){
            boolean x=true;
            for(int j=0;j<words[i].length();j++){
                if(arr[words[i].charAt(j)-'a']==false){
                    x=false;
                }
            }
            if(x){
                count++;
            }
        }
        return count;
    }
}