class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int res = 0;
        long last = 0;
        for (int coin : coins) {
            while (last < coin - 1) {
                last = 2 * last + 1;
                ++res;
            }
            last += coin;
        }

        while (last < target) {
            last = 2 * last + 1;
            ++res;
        }
        return res;
    }
}