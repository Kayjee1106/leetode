class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> ptc = new HashMap<>();
        int[] num = new int[n];
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            ptc.putIfAbsent(parent, new HashSet<>());
            ptc.get(parent).add(child);
            num[child]++;
        }
        List<TreeSet<Integer>> ctp = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ctp.add(new TreeSet<>());
            if (num[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int cp = q.poll();
            for (int cc : ptc.getOrDefault(cp, new HashSet<>())) {
                ctp.get(cc).add(cp);
                ctp.get(cc).addAll(ctp.get(cp));
                num[cc]--;
                if (num[cc] == 0) {
                    q.offer(cc);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (TreeSet<Integer> set : ctp) {
            result.add(new ArrayList<>(set));
        }
        return result;
    }
}
