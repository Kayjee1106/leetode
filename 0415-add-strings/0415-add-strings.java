class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder();
        int x=num1.length()-1;
        int y=num2.length()-1;
        int carry=0;
        while(x>=0 || y>=0 || carry!=0){
            int i=(x>=0)?num1.charAt(x)-'0' :0;
            int j=(y>=0)?num2.charAt(y)-'0' :0;
            int sum=i+j+carry;
            result.append(sum%10);
            carry=sum/10;
            x--;
            y--;
        }
        return result.reverse().toString();
    }
}