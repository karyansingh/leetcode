class Solution {
    boolean isRow(int[][] matrix) {
        int n = matrix.length;
        int expectedSum = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean[] seen = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                if (val < 1 || val > n || seen[val]) return false;
                seen[val] = true;
                sum += val;
            }
            if (sum != expectedSum) return false;
        }
        return true;
    }

    boolean isCol(int[][] matrix) {
        int n = matrix.length;
        int expectedSum = (n * (n + 1)) / 2;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean[] seen = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int val = matrix[j][i];
                if (val < 1 || val > n || seen[val]) return false;
                seen[val] = true;
                sum += val;
            }
            if (sum != expectedSum) return false;
        }
        return true;
    }

    public boolean checkValid(int[][] matrix) {
        return isRow(matrix) && isCol(matrix);
    }
}