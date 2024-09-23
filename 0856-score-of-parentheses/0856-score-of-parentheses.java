class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(c+"");
            }
            else{
                if(c==')'){
                    int score=0;
                    while(!st.isEmpty() && !st.peek().equals("(")){
                        score+=Integer.valueOf(st.peek());
                        st.pop();
                    }
                    st.pop();
                    if(score==0){
                        st.push("1");
                    }
                    else{
                        st.push(2*score+"");
                    }
                }
                else{
                    st.push(c+"");
                }
            }
        }
        int ts=0;
        while(!st.isEmpty()){
            ts+=Integer.valueOf(st.peek());
            st.pop();
        }
        return ts;
    }
}