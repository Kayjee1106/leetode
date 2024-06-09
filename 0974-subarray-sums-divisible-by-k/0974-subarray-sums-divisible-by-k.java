class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount=new int[k];
        remainderCount[0]=1;
        int count=0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) {
                remainder += k;
            }
            count+=remainderCount[remainder];
            remainderCount[remainder]++;
        }
        return count;
    }
}