class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int val=0;
        char op='+';
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                val=val*10+(ch-'0');
            }
            if(!Character.isDigit(ch) && ch!=' ' || i==s.length()-1){
                if(op=='+'){
                    st.push(val);
                }
                else if(op=='-'){
                    st.push(-1*val);
                }
                else if(op=='*'){
                    st.push(st.pop()*val);
                }
                else if(op=='/'){
                    st.push(st.pop()/val);
                }
                op=ch;
                val=0;
            }
        }
        int result=0;
        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;
    }
}
