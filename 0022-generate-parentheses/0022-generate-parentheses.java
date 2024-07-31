class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        solve(n,"",0,0);
        return ans;
    }
    private void solve(int n,String s,int open,int close){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            s+='(';
            solve(n,s,open+1,close);
            s=s.substring(0,s.length()-1);
        }
        if(close<open){
            s+=')';
            solve(n,s,open,close+1);
            s=s.substring(0,s.length()-1);
        }
    }
}