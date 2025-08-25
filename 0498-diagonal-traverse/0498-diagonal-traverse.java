class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) return new int[0];

        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows * cols];

        int row = 0, col = 0;

        for (int i = 0; i < rows * cols; i++) {
            res[i] = mat[row][col];

            // Moving up-right
            if ((row + col) % 2 == 0) {
                if (col == cols - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            }
            // Moving down-left
            else {
                if (row == rows - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return res;
    }
}