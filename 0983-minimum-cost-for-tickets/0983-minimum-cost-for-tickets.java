import java.util.Arrays;

class Solution {
    int t[] = new int[366];

    public int solve(int days[], int costs[], int n, int i) {
        if (i >= n) {
            return 0;
        }
        if (t[i] != -1) {
            return t[i]; // fixed here
        }

        // One day pass
        int cost_1 = costs[0] + solve(days, costs, n, i + 1);

        // Seven day pass
        int j = i;
        int max_days = days[i] + 7;
        while (j < n && days[j] < max_days) {
            j++;
        }
        int cost_7 = costs[1] + solve(days, costs, n, j);

        // Thirty day pass
        j = i;
        max_days = days[i] + 30;
        while (j < n && days[j] < max_days) {
            j++;
        }
        int cost_30 = costs[2] + solve(days, costs, n, j);

        return t[i] = Math.min(cost_1, Math.min(cost_7, cost_30));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        Arrays.fill(t, -1);
        return solve(days, costs, n, 0);
    }
}
