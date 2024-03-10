class Solution {
    public int myAtoi(String s) {
        try {
            s = s.trim();
            if (s.isEmpty()) return 0; 
            char firstChar = s.charAt(0);
            if (!Character.isDigit(firstChar) && firstChar != '-' && firstChar != '+')
                return 0;
            int sign = 1;
            int startIndex = 0;
            if (firstChar == '-') {
                sign = -1;
                startIndex++;
            } else if (firstChar == '+') {
                startIndex++;
            }
            long result = 0;
            for (int i = startIndex; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!Character.isDigit(c)) 
                    break;
                result = result * 10 + (c - '0');
                if (sign * result > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else if (sign * result < Integer.MIN_VALUE) 
                    return Integer.MIN_VALUE;
            }
            return (int) (sign * result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
