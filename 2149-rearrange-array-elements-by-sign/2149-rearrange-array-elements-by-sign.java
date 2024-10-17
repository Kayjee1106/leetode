class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> neg=new LinkedList<>();
        Queue<Integer> pos=new LinkedList<>();
        for(int n:nums){
            if(n>=0)pos.add(n);
            else neg.add(n);
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0)nums[i]=pos.poll();
            else nums[i]=neg.poll();
        }
        return nums;
    }
}