class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] ch = s.toCharArray();

        while (left < right) {
            while (left < right && !isVowel(ch[left])) {
                left++;
            }
            while (left < right && !isVowel(ch[right])) {
                right--;
            }
            // Swap vowels
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return new String(ch);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}