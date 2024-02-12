class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int ans=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for (int c : nums) {
            if (hash.containsKey(c)) {
                hash.put(c, hash.get(c) + 1);
            }
            else {
                hash.put(c, 1);
            }
        }
          for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
              if(entry.getValue()>max){
                  max=entry.getValue();
                  ans=entry.getKey();
              }
        }
        return ans;
    }
}