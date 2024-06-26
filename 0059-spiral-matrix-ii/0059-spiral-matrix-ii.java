class Solution {
    public int[][] generateMatrix(int n) {
        
        
        int m=n;
        int val=1;
        int generatedmatrix[][]=new int[n][n];
        
        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++)
            {
                generatedmatrix[top][i]=val;
                val++;
            }
                
            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
            {
                generatedmatrix[i][right]=val;
                val++;
            }
             right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    {
                        generatedmatrix[bottom][i]=val;
                         val++;
                    }

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                   {
                     generatedmatrix[i][left]=val;
                     val++;
                   }

                left++;
            }
        }
        return generatedmatrix;
    }
}