class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        if(n<=1){
            return nums;
        }
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        for(int j=n-2;j>=0;j--){
            right[j]=nums[j+1]*right[j+1];
        }
        for(int i=0;i<n;i++){
            result[i]=right[i]*left[i];
        }
        return result;
    }
}