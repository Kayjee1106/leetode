class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n2=magazine.length();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<n2;i++){
            Character ch2=magazine.charAt(i);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            Character ch=ransomNote.charAt(i);
            if(!map2.containsKey(ch) || map2.get(ch)==0){
                return false;
            }
            map2.put(ch,map2.get(ch)-1);
        }
        return true;
    }
}