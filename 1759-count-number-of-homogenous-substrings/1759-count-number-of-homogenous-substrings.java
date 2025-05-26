class Solution {
    public int countHomogenous(String s) {
        final int MOD = 1_000_000_007;
        long count = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                len++;
            } else {
                len = 1;
            }
            count = (count + len) % MOD;
        }

        return (int) count;
    }
}
