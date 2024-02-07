class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int max=0;
        for(String s:words){
            map.put(s, map.getOrDefault(s, 0) + 1);
            }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a)
        );
        for (String word : map.keySet()) {
            pq.add(word);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        return result;
        }
    }