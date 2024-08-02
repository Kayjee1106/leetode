class Solution {
    public String simplifyPath(String path) {
        String[] str=path.split("/");
        Stack<String> st=new Stack<>();
        String result="";
        for(int i=0;i<str.length;i++){
            if(str[i].equals(".")|| str[i].equals(""))continue;
            if(str[i].equals("..")){
                if(!st.isEmpty())st.pop();
            }
            else st.push(str[i]);
        }
        while(!st.isEmpty()){
            result="/"+st.peek()+result;
            st.pop();
        }
         if (result.isEmpty()) {
            result = "/";
        }
        return result;
    }
}