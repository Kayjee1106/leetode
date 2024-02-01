class Solution {
    public boolean isPowerOfTwo(int n) {
      if (n <= 0) {
            return false;
        }
        int result = (int) (Math.log(n) / Math.log(2));
        return n == Math.pow(2, result);
    }
}