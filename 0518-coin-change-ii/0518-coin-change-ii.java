import java.util.Arrays;

class Solution {
    int n;
    int[][] t = new int[301][5001];

    public int change(int amount, int[] coins) {
        n = coins.length;
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return solve(0, coins, amount);
    }

    public int solve(int i, int[] coins, int amount) {
        if (amount == 0) return 1;
        if (i == n) return 0;

        if (t[i][amount] != -1) return t[i][amount];

        if (amount < coins[i]) {
            return t[i][amount] = solve(i + 1, coins, amount);
        }

        int take = solve(i, coins, amount - coins[i]);
        int skip = solve(i + 1, coins, amount);

        return t[i][amount] = take + skip;
    }
}
