class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] freq = new int[3]; 
        int l = 0; 

        
        for (int r = 0; r < s.length(); r++) {
          
            freq[s.charAt(r) - 'a']++;
            
            // Check if the window contains at least one of each 'A', 'B', 'C'
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                // All substrings starting from index l to r are valid
                count += (s.length() - r);
                
                // Move the left boundary to the right
                freq[s.charAt(l) - 'a']--;
                l++;
            }
        }
        
        return count;
    }
}
