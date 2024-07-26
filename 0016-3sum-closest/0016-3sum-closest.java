class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=Integer.MAX_VALUE;
        int n=nums.length;
        int i=0;int j=0;
        Arrays.sort(nums);
        for(int k=0;k<=n-3;k++){
            i=k+1;
            j=n-1;
            while(i<j){
                int s=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-s)<Math.abs(target-sum)){
                    sum=s;
                }
                if(s<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return sum;
    }
}