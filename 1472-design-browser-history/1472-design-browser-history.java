class BrowserHistory {
     Stack<String> back;
     Stack<String> fwd;
     String curr;
    public BrowserHistory(String homepage) {
        back=new Stack<>();
        curr=homepage;
        fwd=new Stack();
    }
    
    public void visit(String url) {
        back.push(curr);
        curr=url;
        fwd.clear();
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(!back.isEmpty()){
                fwd.push(curr);
                curr=back.pop();
            }
        }
        return curr;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(!fwd.isEmpty()){
                back.push(curr);
                curr=fwd.pop();
            }
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */