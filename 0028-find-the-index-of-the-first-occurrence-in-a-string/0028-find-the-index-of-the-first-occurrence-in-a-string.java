class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int hayLen = haystack.length();
        int n= needle.length();
        for (int i = 0; i <= hayLen-n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j==n) {
                return i;
            }
        }
        
        return -1;
    }
}