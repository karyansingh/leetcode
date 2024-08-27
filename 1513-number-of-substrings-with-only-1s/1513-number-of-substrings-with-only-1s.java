class Solution {
    public int numSub(String s) {
        int count = 0;
        int result = 0;
        int mod = 1_000_000_007; // To handle large numbers

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                result = (result + count) % mod;
            } else {
                count = 0;
            }
        }
        return result;
    }
}
