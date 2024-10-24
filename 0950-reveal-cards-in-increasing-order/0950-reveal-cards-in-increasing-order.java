class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        boolean skip = false;
        
        int i = 0;
        int j = 0;
        
        Arrays.sort(deck);
        
        while (i < n) {
            if (result[j] == 0) {
                if (!skip) {
                    result[j] = deck[i];
                    i++;
                }
                skip = !skip;
            }
            j = (j + 1) % n;
        }
        
        return result;
    }
}