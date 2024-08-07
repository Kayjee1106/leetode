class Solution {
    public int lengthOfLIS(int[] nums) {
        int t[]=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(t[i]<t[j]+1){
                        t[i]=t[j]+1;
                    }
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(t[i]>t[max]){
                max=i;
            }
        }
        return t[max]+1;
    }
}