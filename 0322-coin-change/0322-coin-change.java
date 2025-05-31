import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] coinDp = new int[amount + 1];
        Arrays.fill(coinDp, Integer.MAX_VALUE);
        coinDp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && coinDp[i - coin] != Integer.MAX_VALUE) {
                    coinDp[i] = Math.min(coinDp[i], 1 + coinDp[i - coin]);
                }
            }
        }

        return coinDp[amount] == Integer.MAX_VALUE ? -1 : coinDp[amount];
    }
}
