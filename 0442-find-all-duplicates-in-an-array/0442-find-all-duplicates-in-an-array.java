class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int key : mp.keySet()) {
            if (mp.get(key) > 1) {
                arr.add(key);
            }
        }
        return arr;
    }
}