class Solution {
    public int tribonacci(int n) {
         int[] t = new int[38];
        Arrays.fill(t, -1);
        return calculateTribonacci(n, t);
    }
    private int calculateTribonacci(int n, int[] t) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (t[n] != -1) {
            return t[n];
        }
        int a = calculateTribonacci(n - 1, t);
        int b = calculateTribonacci(n - 2, t);
        int c = calculateTribonacci(n - 3, t);
        return t[n] = a + b + c;
    }
}