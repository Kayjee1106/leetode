public class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;

        if (n < d)
            return -1;

        int[][] t = new int[n + 1][d + 1];

        // Base case: if there is only one day - Do all jobs on that day
        for (int i = 0; i < n; i++) {
            t[i][1] = Arrays.stream(Arrays.copyOfRange(jobDifficulty, i, n)).max().orElse(Integer.MIN_VALUE);
        }

        // Build the DP table bottom-up
        for (int days = 2; days <= d; days++) {
            for (int i = 0; i <= n - days; i++) {
                int maxDifficulty = Integer.MIN_VALUE;
                int result = Integer.MAX_VALUE;

                for (int j = i; j <= n - days; j++) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[j]);
                    result = Math.min(result, maxDifficulty + t[j + 1][days - 1]);
                }

                t[i][days] = result;
            }
        }

        return t[0][d];
    }
}