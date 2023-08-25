class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        String [] arr1=jewels.split("");
        String [] arr2=stones.split("");
        HashMap<String,Boolean> hm=new HashMap<>();
        for(String i:arr1){
            hm.put(i,true);
        }
        for(String j:arr2){
            if(hm.get(j)!=null){
                count++;
            }
        }
        System.gc();
        return count;
    }
}