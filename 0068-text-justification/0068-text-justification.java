class Solution {
    int maxW;
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result =new ArrayList<>();
        int n=words.length;
        maxW=maxWidth;
        int i=0;
        while(i<n){
            int letterCount=words[i].length();
            int j=i+1;
            int spaceSlots=0;
            while(j<n && words[j].length()+letterCount+spaceSlots+1<=maxWidth){
                letterCount+=words[j].length();
                spaceSlots+=1;
                j++;
            }
            int remainingSlots=maxWidth-letterCount;
            int eachWordSpace= spaceSlots==0?0:remainingSlots/spaceSlots;
            int extraSpace= spaceSlots==0?0:remainingSlots%spaceSlots;
            if(j==n){
                eachWordSpace=1;
                extraSpace=0;
            }
            result.add(getFinalWord(i,j, eachWordSpace,extraSpace, words));
            i=j;
        }
    return result;
    }
    private String getFinalWord(int i,int j,int eachWordSpace,int extraSpace, String[] words){
        StringBuilder s=new StringBuilder();
        for(int k=i;k<j;k++){
            s.append(words[k]);
            if(k==j-1)continue;
            for(int space = 1; space <= eachWordSpace; space++)
                s.append(" ");
            if(extraSpace>0){
                s.append(" ");
                extraSpace--;
            }
        }
        while(s.length() < maxW) {
            s.append(" ");
        }
        return s.toString();
    }
}