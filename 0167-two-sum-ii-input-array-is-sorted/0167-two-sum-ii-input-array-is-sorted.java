class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=1;i<=numbers.length;i++){
        //     int x=numbers[i-1];
        //     int diff=target-x;
        //     if(map.containsKey(diff)){
        //         return new int[]{map.get(diff),i};
        //     }
        //     map.put(x,i);
        // }
        // return new int[]{};
        
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int sum=numbers[r]+numbers[l];
            if(sum==target){
                return new int[]{l+1,r+1};
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}