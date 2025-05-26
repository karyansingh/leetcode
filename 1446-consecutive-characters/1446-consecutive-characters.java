class Solution {
    public int maxPower(String s) {
        int pow = 1; // At least one character is there
        int len = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                len++;
            } else {
                len = 1;
            }
            pow = Math.max(pow, len);
        }

        return pow;
    }
}
