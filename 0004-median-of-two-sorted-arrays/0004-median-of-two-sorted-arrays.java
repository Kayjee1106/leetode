class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        double c = 0;
        double d = 0;
        double median = 0;

        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list1.add(nums2[i]);
        }
        Collections.sort(list1);
        if(list1.size()==1){
            median=list1.get(0);
        }
        else if (list1.size() % 2 != 0) {
            c = Math.ceil(list1.size() / 2.0);
            median = list1.get((int) c-1);
        }
         else if(list1.size()%2==0) {
            c = list1.size() / 2.0; 
            d = c - 1;
            median = (list1.get((int) c) + list1.get((int) d)) / 2.0; 
        }
        return median;
        
    }
}
