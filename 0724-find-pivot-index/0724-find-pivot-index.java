class Solution {
    int sum(int i,int n,int[] arr){
        int sum=0;
        while(i<n){
            sum+=arr[i];
            i++;
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        if(sum(1,nums.length,nums)==0){
            return 0;
        }
        for(int pivot=1;pivot<nums.length;pivot++){
            if(sum(0,pivot,nums)==sum(pivot+1,nums.length,nums)){
                return pivot;
            }
        }
        return -1;
    }
}