class Solution {
    private static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        return (int)(modularExponentiation(5, even, MOD) * modularExponentiation(4, odd, MOD) % MOD);
    }

    private long modularExponentiation(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
