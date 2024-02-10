class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        int sum=0;
      for(int i=0;i<operations.length;i++){
          if(operations[i].equals("D")){
              s.push(2*s.peek());
          }
          else if(operations[i].equals("C")){
              s.pop();
          }
          else if(operations[i].equals("+")){
              int top = s.pop();
                int newTop = top + s.peek();
                s.push(top);
                s.push(newTop);
          }
          else{
              s.push(Integer.parseInt(operations[i]));
          }
      }
        while(!s.isEmpty()){
            sum=sum+s.peek();
            s.pop();
        }
        return sum;
    }
}