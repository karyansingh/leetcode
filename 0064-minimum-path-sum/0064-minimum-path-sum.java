class Solution {
    private int helper(int n,int m,int[][] arr,int[][] dp)
    {
        if(n==0 && m==0)
        return arr[n][m];
        
        if(n<0 || m<0)
        return Integer.MAX_VALUE;

        if(dp[n][m]!=-1)
        return dp[n][m];

        int up=(n > 0) ? arr[n][m] + helper(n - 1, m, arr, dp) : Integer.MAX_VALUE;
        int left=(m > 0) ? arr[n][m] + helper(n, m - 1, arr, dp) : Integer.MAX_VALUE;

        dp[n][m]=Math.min(up,left);
        return dp[n][m];

    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int[] ele:dp)
        Arrays.fill(ele,-1);
        return helper(n-1,m-1,grid,dp);
    }
}