class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> projects = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            projects.add(new int[]{capital[i], profits[i]});
        }
        projects.sort(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while (k-- > 0) {
            while (i < n && projects.get(i)[0] <= w) {
                max.add(projects.get(i)[1]);
                i++;
            }
            if (max.isEmpty()) {
                break;
            }
            w += max.poll();
        }
        return w;
    }
}