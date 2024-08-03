class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.trim().length() == 0) return false;
        boolean numberSeen = false;
        boolean decimalSeen = false;
        boolean eSeen =false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                numberSeen = true;
            } else if (ch == '.') {
                if (decimalSeen || eSeen) return false;
                decimalSeen = true;
            } else if (ch == 'e' || ch == 'E') {
                if (!numberSeen || eSeen) return false;
                eSeen = true;
                numberSeen = false; // Reset for checking digits after 'e'
            } else if (ch == '+' || ch == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
                numberSeen = false; // Reset for checking digits after sign
            } else {
                return false;
            }
        }

        return numberSeen;
    }
}