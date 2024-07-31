class Solution {
    private String solve(String s){
        int [] count=new int[26];
         for(char ch : s.toCharArray()){
            count[ch-'a']++;
        }
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<26;i++){
            if(count[i]>0){
                temp.append(String.valueOf((char) (i + 'a')).repeat(count[i]));
            }
        }
        return temp.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            String temp=solve(s);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
//         public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();
        
//         for (String word : strs) {
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sortedWord = new String(chars);
            
//             if (!map.containsKey(sortedWord)) {
//                 map.put(sortedWord, new ArrayList<>());
//             }
            
//             map.get(sortedWord).add(word);
//         }
        
//         return new ArrayList<>(map.values());
//     }
    
}