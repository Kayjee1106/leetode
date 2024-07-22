class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int r=intervals.length;
        int [] curr=intervals[0];
        for(int i=1;i<r;i++){
            int [] next=intervals[i];
            if(curr[1]>=next[0]){
                curr[1]=Math.max(curr[1],next[1]);
            }
            else{
            ans.add(curr);
            curr=next;
            }
        }
        ans.add(curr);
        return ans.toArray(new int[ans.size()][]);
    }
}