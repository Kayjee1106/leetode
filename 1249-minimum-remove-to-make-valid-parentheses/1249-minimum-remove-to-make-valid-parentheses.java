class Solution {
    public String minRemoveToMakeValid(String s) {
//         int n=s.length();
//         HashSet<Integer> toRemove = new HashSet<>();
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             if(ch=='(')
//                 st.push(i);
//             else if(ch==')'){
//                 if(st.isEmpty())
//                     toRemove.add(i);
//                 else
//                     st.pop();
//             }
//         }
//         while(!st.isEmpty())
//             toRemove.add(st.pop());
//         StringBuilder result = new StringBuilder();
//         for(int i = 0; i < n; i++) {
//             if(!toRemove.contains(i))
//                 result.append(s.charAt(i));
//         }
//         return result.toString();
        
        
        
        int n=s.length();
        int open=0;
        int close=0;
        String res1="";
        StringBuilder res2=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res1+=s.charAt(i);
            }
            else if(s.charAt(i)=='('){
                open++;
                res1+=s.charAt(i);
            }
            else if(open>0){
                open--;
                res1+=s.charAt(i);
            }
        }
        for(int i=res1.length()-1;i>=0;i--){
            if(res1.charAt(i)>='a' && res1.charAt(i)<='z'){
                res2.append(res1.charAt(i));
            }
             else if(res1.charAt(i)==')'){
                close++;
                res2.append(res1.charAt(i));
            }
            else if(close>0){
                close--;
                res2.append(res1.charAt(i));
            }
        }
        return res2.reverse().toString();
        
    }
}