import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int max = 0;
        int[] currRow = new int[matrix[0].length];

        // Process the first row
        for (int j = 0; j < matrix[0].length; j++) {
            currRow[j] = matrix[0][j] == '1' ? 1 : 0;
        }
        max = maxArea(currRow);

        // Process the rest of the rows
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    currRow[j] += 1;
                } else {
                    currRow[j] = 0;
                }
            }
            int ans = maxArea(currRow);
            max = Math.max(ans, max);
        }

        return max;
    }

    private int maxArea(int[] a) {
        int max = 0;
        int[] ps = previousSmaller(a);
        int[] ns = nextSmaller(a);
        for (int i = 0; i < a.length; i++) {
            int curr = (ns[i] - ps[i] - 1) * a[i];
            max = Math.max(max, curr);
        }
        return max;
    }

    private int[] previousSmaller(int[] a) {
        int[] ps = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            if (st.isEmpty()) ps[i] = -1;
            else ps[i] = st.peek();
            st.push(i);
        }
        return ps;
    }

    private int[] nextSmaller(int[] a) {
        int[] ns = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            if (st.isEmpty()) ns[i] = a.length;
            else ns[i] = st.peek();
            st.push(i);
        }
        return ns;
    }
}
