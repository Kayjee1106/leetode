class Solution {
    public boolean isNumber(String s) {
        if(s==null || s.trim().length()==0) return false;
        boolean decimalSeen=false;
        boolean numberSeen=false;
        boolean eSeen=false;
        boolean numberAfterE = true;
        s.trim();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            switch(ch){
                case '.':
                    if(decimalSeen || eSeen)return false;
                    decimalSeen=true;
                    break;
                case 'E':
                case 'e':
                    if(eSeen || !numberSeen) return false;
                    eSeen=true;
                    numberAfterE=false;
                    break;
                case '+':
                case '-':
                    if(i!=0 && s.charAt(i-1)!='e' && s.charAt(i - 1) != 'E')return false;
                    numberSeen=false;
                    break;
                default:
                    if(!Character.isDigit(ch))return false;
                    numberSeen=true;
                    numberAfterE=true;
            }
        }
        return numberSeen && numberAfterE;
    }
}