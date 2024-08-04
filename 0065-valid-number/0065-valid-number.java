class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.trim().isEmpty()) return false;
        
        s = s.trim();
        boolean decimalSeen = false;
        boolean numberSeen = false;
        boolean eSeen = false;
        boolean numberAfterE = true; // To handle edge case when 'e' is at the end

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '.':
                    if (decimalSeen || eSeen) return false;
                    decimalSeen = true;
                    break;
                case 'e':
                case 'E':
                    if (eSeen || !numberSeen) return false;
                    eSeen = true;
                    numberAfterE = false; // Need to have a number after 'e'
                    break;
                case '+':
                case '-':
                    if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
                    numberSeen = false; // Reset numberSeen for cases like '2e+2'
                    break;
                default:
                    if (!Character.isDigit(ch)) return false;
                    numberSeen = true;
                    numberAfterE = true;
            }
        }
        return numberSeen && numberAfterE;
    }
}
