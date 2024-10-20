class Solution {
    public int compress(char[] chars) {
        // char x=chars[0];
        // int count=0;
        // int y=0;
        // HashMap<Character,Integer> mp=new HashMap<>();
        // for(char ch:chars){
        //     if(ch!=x){
        //         x=ch;
        //         mp.put(x,1);
        //     }
        //     mp.put(x,mp.getOrDefault(x,0)+1);
        // }
        // Iterator y=mp.entrySet().iterator();
        // for(int i=0;i<chars.length;i++){
        //     while(mp.hasNext()){
        //         Map.Entry el=(Map.Entry)el.next();
        //         char s=(char)((int)el.getValue+10);
        //     }
        // }
        // return 2*mp.size();
        //sahi krna hai code
        int index=0;
        int i=0;
        while(i<chars.length){
            char c=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==c){
                i++;
                count++;
            }
            chars[index++]=c;
            if(count>1){
                for(char ch:Integer.toString(count).toCharArray()){
                    chars[index++]=ch;
                }
            }
        }
        return index;
    }
}