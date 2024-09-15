class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Move the left pointer forward if it's not an alphanumeric character
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Move the right pointer backward if it's not an alphanumeric character
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Compare the characters after converting both to lowercase
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
