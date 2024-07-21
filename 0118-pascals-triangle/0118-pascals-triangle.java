class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                l.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
             if (i > 0) {
                l.add(1);
            }
            ans.add(l);
        }
        return ans;
    }
}