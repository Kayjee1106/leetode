class Solution {
    public String reversePrefix(String word, char ch) {
        int pos=word.indexOf(ch);
        if(pos==-1){
            return word;
        }
        StringBuilder sb=new StringBuilder(word.substring(0,pos+1)).reverse();
        sb.append(word.substring(pos+1,word.length()));
        return sb.toString();
    }
}