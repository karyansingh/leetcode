class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] temp = new int[m][n];

        // Start cell
        temp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        // First row
        for (int j = 1; j < n; j++) {
            temp[0][j] = (obstacleGrid[0][j] == 1 || temp[0][j - 1] == 0) ? 0 : 1;
        }

        // First column
        for (int i = 1; i < m; i++) {
            temp[i][0] = (obstacleGrid[i][0] == 1 || temp[i - 1][0] == 0) ? 0 : 1;
        }

        // Rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    temp[i][j] = 0;
                } else {
                    temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
                }
            }
        }

        return temp[m - 1][n - 1];
    }
}