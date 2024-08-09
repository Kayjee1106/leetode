class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int n;
    int t[][]=new int[2001][2001];
    private boolean solve(int[] stones,int idx,int prev_jump){
        if(idx==n-1)return true;
        boolean result=false;
        if(t[idx][prev_jump]!=-1)return t[idx][prev_jump]==1;
        for(int next=prev_jump-1;next<=prev_jump+1;next++){
            if(next>0){
                int next_stone=stones[idx]+next;
                if(map.containsKey(next_stone)){
                    result=result || solve(stones,map.get(next_stone),next);
                }
            }
        }
        t[idx][prev_jump]=(result?1:0);
        return result;
    }
    public boolean canCross(int[] stones) {
        n=stones.length;
        if(stones[1]!=1)return false;
        for(int i=0;i<stones.length;i++){
            map.put(stones[i],i);
        }
        for(int i=0;i<2000;i++){
            Arrays.fill(t[i],-1);
        }
        return solve(stones,0,0);
    }
}