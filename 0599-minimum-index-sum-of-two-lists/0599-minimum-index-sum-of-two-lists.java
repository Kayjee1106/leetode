class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    int minSum = Integer.MAX_VALUE;
    List<String> result = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < list1.length; i++) {
        map.put(list1[i], i);
    }

    for (int j = 0; j < list2.length; j++) {
        Integer index = map.get(list2[j]);
        if (index != null && index + j < minSum) {
            minSum = index + j;
            result.clear();
            result.add(list2[j]);
        } else if (index != null && index + j == minSum) {
            result.add(list2[j]);
        }
    }

    return result.toArray(new String[result.size()]);
    }
}