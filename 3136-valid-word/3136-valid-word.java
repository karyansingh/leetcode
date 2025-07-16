class Solution {

    // Check if the word contains at least one vowel
    boolean containsVowels(String word){
        for(char c : word.toCharArray()){
            if ("aeiouAEIOU".indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    // Check if the word contains at least one consonant
    boolean containsConsonent(String word){
        for(char c : word.toCharArray()){
            if (((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) &&
                "aeiouAEIOU".indexOf(c) == -1) {
                return true;
            }
        }
        return false;
    }

    // Check if the word is valid
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        // Ensure all characters are alphanumeric
        for(char c : word.toCharArray()){
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Must contain at least one consonant and one vowel
        if (!containsConsonent(word)) return false;
        if (!containsVowels(word)) return false;

        return true;
    }
}
