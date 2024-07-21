class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sf=0;
        int sb=0;
        int[] fwd=new int[n];
        int[] bwd=new int[n];
        for(int i=0;i<n;i++){
            fwd[i]=sf+nums[i];
            sf=fwd[i];
        }
        for(int j=n-1;j>=0;j--){
            bwd[j]=sb+nums[j];
            sb=bwd[j];
        }
        for(int k=0;k<n;k++){
            if(fwd[k]==bwd[k]){
                return k;
            }
        }
        return -1;
    }
}