class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        StringBuilder result=new StringBuilder();
        for (int k = 0; k < n; k++) {
            result.append('0');
        }
        int i=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                if(result.charAt(n-1)=='1'){
                    result.setCharAt(i,'1');
                    i++;
                }
                else{
                    result.setCharAt(n-1,'1');
                }
            }
        }
        return result.toString();
    }
}