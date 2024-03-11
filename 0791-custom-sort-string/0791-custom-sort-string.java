class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                int count = frequencyMap.get(c);
                while (count > 0) {
                    ans.append(c);
                    count--;
                }
                frequencyMap.remove(c);
            }
        }
        for (char c : frequencyMap.keySet()) {
            int count = frequencyMap.get(c);
            while (count > 0) {
                ans.append(c);
                count--;
            }
        }
        return ans.toString();
    }
}