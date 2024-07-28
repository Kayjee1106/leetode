class Solution {
    private int[] prevSmaller(int[] b){
        int[] a= new int[b.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<b.length;i++){
            while(!s.isEmpty() && b[s.peek()]>=b[i]){
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=-1;
            }
            else{
                a[i]=s.peek();
            }
            s.push(i);
        }
        return a;
    }
    private int[] nextSmaller(int[] b){
        int[] a=new int[b.length];
        Stack<Integer> s=new Stack<>();
        for(int i=b.length-1;i>=0;i--){
            while(!s.isEmpty() && b[s.peek()]>=b[i]){
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=b.length;
            }
            else{
                a[i]=s.peek();
            }
            s.push(i);
        }
        return a;
    }
    public int largestRectangleArea(int[] heights) {
        int max=0;
        int [] p=prevSmaller(heights);
        int [] n=nextSmaller(heights);
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,(n[i]-p[i]-1)*heights[i]);
        }
        return max;
    }
}