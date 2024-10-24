class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int len=0;
        int ans=0;
        for(int a:nums){
            s.add(a);
        }
        for(int el:s){
            if(!s.contains(el-1)){
                len=1;
                int x=el;
                while(s.contains(x+1)){
                    len++;
                    x++;
                }
                ans=Math.max(len,ans);
            }
        }
        return ans;
    }
}