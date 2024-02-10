class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> s=new ArrayList<>();
        List<Integer> q=new ArrayList<>();
        int targetIndex=0;
        for(int i=1;i<=n;i++){
            q.add(i);
            s.add("Push");
            if (q.get(q.size() - 1) == target[targetIndex]) {
                targetIndex++;
            if (targetIndex == target.length) {
                    break;
                }
            }
           else{
               s.add("Pop");
               q.remove(q.size()-1);
           }
        }
        return s ;
    }
}
