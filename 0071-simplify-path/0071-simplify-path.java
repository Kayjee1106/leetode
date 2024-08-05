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
         if (result.isEmpty()){
            result = "/";
        }
        return result;
    }
}
// class Solution {
//     public String simplifyPath(String path) {
//         String[] parts = path.split("/");
//         Deque<String> deque = new LinkedList<>();

//         for (String part : parts) {
//             if (part.equals("") || part.equals(".")) {
//                 continue;
//             } else if (part.equals("..")) {
//                 if (!deque.isEmpty()) {
//                     deque.pollLast();
//                 }
//             } else {
//                 deque.offerLast(part);
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         for (String dir : deque) {
//             result.append("/").append(dir);
//         }
//         return result.length() > 0 ? result.toString() : "/";
//     }
// }