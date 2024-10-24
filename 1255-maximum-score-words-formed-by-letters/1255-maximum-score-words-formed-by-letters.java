class Solution {
    int n;
    int maxScore;
    private void solve(int i, int[] score, String[] words, int currScore, int[] freq) {
        maxScore = Math.max(maxScore, currScore);
        if (i >= n)
            return;
        int[] tempFreq = Arrays.copyOf(freq, freq.length);
        int j = 0;
        int tempScore = 0;
        while (j < words[i].length()) {
            char ch = words[i].charAt(j);
            tempFreq[ch - 'a']--;
            tempScore += score[ch - 'a'];
            if (tempFreq[ch - 'a'] < 0)
                break;
            j++;
        }
        if (j == words[i].length()) {
            solve(i + 1, score, words, currScore + tempScore, tempFreq);
        }
        solve(i + 1, score, words, currScore, freq);
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for (char ch : letters) {
            freq[ch - 'a']++;
        }
        maxScore = Integer.MIN_VALUE;
        n = words.length;
        solve(0, score, words, 0, freq);
        return maxScore;
    }
}