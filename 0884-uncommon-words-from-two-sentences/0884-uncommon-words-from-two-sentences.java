class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Concatenate the two sentences with a space
        String[] words = (s1 + " " + s2).split(" ");
        
        // Create a map to store the frequency of each word
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each word
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Create a list for uncommon words (frequency = 1)
        List<String> uncommonWords = new ArrayList<>();
        for (String word : frequencyMap.keySet()) {
            if (frequencyMap.get(word) == 1) {
                uncommonWords.add(word);
            }
        }
        
        // Return the list as a String array
        return uncommonWords.toArray(new String[0]);
    }
}
