class Solution {
    public boolean check(HashMap<Integer,ArrayList<Integer>> mp,int node,int dest,boolean[] visited){
        if(node==dest){
            return true;
        }
        if(visited[node]){
            return false;
        }
        visited[node]=true;
        for(int it: mp.getOrDefault(node,new ArrayList<>())) {
            if(check(mp, it, dest, visited))
                return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        for(int[] vec:edges){
            int u=vec[0];
            int v=vec[1];
            mp.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            mp.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        boolean[] visited = new boolean[n];
        return check(mp, source, destination, visited);
    }
}