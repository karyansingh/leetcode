class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Sort diagonals starting from first column
        for (int row = 0; row < n; row++) {
            sortDiagonal(mat, row, 0, n, m);
        }

        // Sort diagonals starting from second column
        for (int col = 1; col < m; col++) {
            sortDiagonal(mat, 0, col, n, m);
        }

        return mat;
    }

    private void sortDiagonal(int[][] mat, int row, int col, int n, int m) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int r = row, c = col;

        // Collect elements
        while (r < n && c < m) {
            pq.offer(mat[r][c]);
            r++;
            c++;
        }

        // Place sorted elements back
        r = row;
        c = col;
        while (!pq.isEmpty()) {
            mat[r][c] = pq.poll();
            r++;
            c++;
        }
    }
}