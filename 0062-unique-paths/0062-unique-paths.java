class Solution {
    public int uniquePaths(int m, int n) {
        int[][] temp = new int[m][n];

        // Initialize first row
        for (int j = 0; j < n; j++) {
            temp[0][j] = 1;
        }

        // Initialize first column
        for (int i = 0; i < m; i++) {
            temp[i][0] = 1;
        }

        // Fill the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
            }
        }

        return temp[m - 1][n - 1];
    }
}