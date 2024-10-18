class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String ans="";
        // int n=word1.length();
        // int m=word2.length();
        // int length=0;
        // if(n>m)length=m;
        // else length=n;
        // char[] w1=word1.toCharArray();
        // char[] w2=word2.toCharArray();
        // for(int i=0;i<length;i++){
        //     ans=ans+w1[i]+w2[i];
        // }
        // if(w1.length==length){
        //     for(int i=length;i<w2.length;i++){
        //         ans+=w2[i];
        //     }
        // }
        // else{
        //     for(int i=length;i<w1.length;i++){
        //         ans+=w1[i];
        //     }
        // }
        // return ans;
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i<word2.length()){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}