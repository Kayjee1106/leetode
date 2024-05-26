class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        boolean l=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }
            else if(i<=s.length()-3 && s.charAt(i+1)=='L'  && s.charAt(i+2)=='L' && s.charAt(i)=='L'
){               l=false;
            }
        }
        return (a<2 && l);
    }
}
