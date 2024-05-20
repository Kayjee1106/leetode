class Solution {
    public int subsetXORSum(int[] nums) {
        int n =nums.length;
        int result=0;
        for(int i:nums){
            result|=i;
        }
        return result<<(n-1);
    }
}
