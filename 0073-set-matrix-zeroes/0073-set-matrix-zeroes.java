class Solution {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length;      // Number of rows
    int n = matrix[0].length;   // Number of columns
    
    // Arrays to track which rows and columns need to be zeroed
    int[] rowsArray = new int[m];
    int[] colsArray = new int[n];
    
    // Iterate through the matrix to mark the rows and columns
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                rowsArray[i] = 1;   // Mark row i
                colsArray[j] = 1;   // Mark column j
            }
        }
    }
    
    // Iterate through the matrix again to set zeros based on the markers
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (rowsArray[i] == 1 || colsArray[j] == 1) {
                matrix[i][j] = 0;   // Set matrix[i][j] to 0 if either row i or column j ismakedr
            }
        }
    }
}

}