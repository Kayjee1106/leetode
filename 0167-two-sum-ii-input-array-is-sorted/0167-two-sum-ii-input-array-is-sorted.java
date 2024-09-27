class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=numbers.length;i++){
            int x=numbers[i-1];
            int diff=target-x;
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(x,i);
        }
        return new int[]{};
    }
}