class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        
        // Count the occurrences of each character in text
        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        // Find the limiting factor
        int minCount = Math.min(freq['b' - 'a'], 
                        Math.min(freq['a' - 'a'], 
                        Math.min(freq['l' - 'a'] / 2, 
                        Math.min(freq['o' - 'a'] / 2, 
                                 freq['n' - 'a']))));

        return minCount;
    }
}
