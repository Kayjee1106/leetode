class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str=s1+" "+s2;
        String[] strings=str.split(" ");
        List<String> ans=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<strings.length;i++){
            map.put(strings[i],map.getOrDefault(strings[i],0)+1);
        }
        for(String key:map.keySet()){
            if(map.get(key)==1){
                ans.add(key);
            }
        }
        return ans.toArray(new String[0]);
    }
}