class Solution {
    private int findCandidate(int a[]){
        int x=0;
        int size=a.length;
        int count=1;
        for(int i=1;i<size;i++){
            if(a[x]==a[i]){
                count++;
            }
            else count--;
            if(count==0){
                x=i;
                count=1;
            }
        }
        return a[x];
    }
    boolean isMajority(int[] arr,int cand){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==cand){
                count++;
            }
        }
        if(count>arr.length/2){
            return true;
        }
        return false;
    }
    public int majorityElement(int[] nums) {
        // int a=nums.length/2;
        // Map<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(mp.containsKey(nums[i])){
        //        int x=mp.get(nums[i]);
        //         x++;
        //         mp.put(nums[i],x);
        //     }
        //     else{
        //         mp.put(nums[i],1);
        //     }
        // }
        // for(Map.Entry<Integer,Integer> s: mp.entrySet()){
        //     if(s.getValue()>a){
        //         return s.getKey();
        //     }
        // }
        // return 0;
        int cand=findCandidate(nums);
        if(isMajority(nums,cand)){
            return cand;
        }
        return 0;
    }
}