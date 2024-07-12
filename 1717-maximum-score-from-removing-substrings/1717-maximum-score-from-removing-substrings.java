class Solution {
    public int maximumGain(String s, int x, int y) {
        int n=s.length();
        int score=0;
        String max=(x>y)?"ab":"ba";
        String min=(x<y)?"ab":"ba";
        String temp1=removeSubstring(s,max);
        int L=temp1.length();
        int rp=(n-L)/2;
        score+=rp*Math.max(x,y);
        String temp2=removeSubstring(temp1,min);
        rp=(L-temp2.length())/2;
        score+=rp*Math.min(x,y);
        return score;
    }
    private String removeSubstring(String s1,String s2){
        StringBuilder sb= new StringBuilder();
        int j=0;
        for(int i=0;i<s1.length();i++){
            sb.append(s1.charAt(i));
            j++;
            if(j>1 &&sb.charAt(j-2)==s2.charAt(0) && sb.charAt(j-1)==s2.charAt(1)){
                sb.delete(j-2,j);
                j-=2;
            }
        }
        return sb.toString();
    }
}
