class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[nums1.length];
        int i=0;
        while(i<nums2.length-1){
            int j=i+1;
            while(j<nums2.length){
                if(nums2[j]>nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }
                j++;
            }
            i++;
        }
        for(int k=0;k<nums1.length;k++){
            if(map.containsKey(nums1[k])){
                ans[k]=map.get(nums1[k]);
            }
            else{
                ans[k]=-1;
            }
        }
        return ans;
    }
}