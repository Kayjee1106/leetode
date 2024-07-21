class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return trimLeadingZeros(digits);
        }
        digits[i] = 0;
    }
    int[] B = new int[n + 1];
    B[0] = 1;
    return B;
}

private int[] trimLeadingZeros(int[] A) {
    int start = 0;
    while (start < A.length && A[start] == 0) {
        start++;
    }
    int[] result = new int[A.length - start];
    for (int i = 0; i < result.length; i++) {
        result[i] = A[start + i];
    }
    return result;
}
}