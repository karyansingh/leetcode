class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int col = 0; col < n; col++) {
            int max = 0;
            for (int row = 0; row < m; row++) {
                int maxInRow = 0;
                for (int j = 0; j < grid[row].length; j++) {
                    maxInRow = Math.max(maxInRow, grid[row][j]);
                }
                max = Math.max(max, maxInRow);
                // Remove the max element from the row
                for (int j = 0; j < grid[row].length; j++) {
                    if (grid[row][j] == maxInRow) {
                        grid[row][j] = Integer.MIN_VALUE; // Mark as removed
                        break;
                    }
                }
            }
            ans += max;
        }
        return ans;
    }
}
