class Solution {
    public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) {
//             return "";
//         }

//         String prefix = strs[0];
//         for (int i = 1; i < strs.length; i++) {
//             while (strs[i].indexOf(prefix) != 0) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//                 if (prefix.isEmpty()) {
//                     return "";
//                 }
//             }
//         }
        StringBuffer prefix=new StringBuffer();
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
            if(i<strs[strs.length-1].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                prefix.append(strs[0].charAt(i));
            }
            else{
                break;
            }
        }

        return prefix.toString();
    }
}