class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length; 

        while (low < high) {
            int mid = low + (high - low) / 2; 

            if (letters[mid] <= target) {
                low = mid + 1; 
            } else {
                high = mid; 
            }
        }

        return letters[low % letters.length];
    }
}
