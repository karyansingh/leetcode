class Solution {
    public int minimumArea(int[][] grid) {
       if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        int top = rows;      
        int bottom = -1;     
        int left = cols;     
        int right = -1;      
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    top = Math.min(top, r);
                    bottom = Math.max(bottom, r);
                    left = Math.min(left, c);
                    right = Math.max(right, c);
                }
            }
        }
        
        int height = bottom - top + 1;
        int width = right - left + 1;
        int area = height * width;
        
        return area;
    }
}