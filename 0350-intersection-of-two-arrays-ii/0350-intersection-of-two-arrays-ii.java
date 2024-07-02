class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Integer[] nums1Integer = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        Integer[] nums2Integer = Arrays.stream(nums2).boxed().toArray(Integer[]::new);
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(nums1Integer));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(nums2Integer));
        ArrayList<Integer> result=new ArrayList<>();
        if (n1 < n2) {
            for (Integer i : num1) {
                if (num2.contains(i)) {
                    result.add(i);
                    num2.remove(i);
                }
            }
        } else {
            for (Integer i : num2) {
                if (num1.contains(i)) {
                    result.add(i);
                    num1.remove(i);
                }
            }
        }

        return convertIntegerListToIntArray(result);
    }
        public static int[] convertIntegerListToIntArray(ArrayList<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}