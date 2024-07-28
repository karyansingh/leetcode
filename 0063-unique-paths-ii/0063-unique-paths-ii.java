class Solution {
    public int helper(int n,int m,int[][] arr,int dp[][])
    {
        if(n<0 || m<0 || arr[n][m]==1)
        return 0;
        if(n==0 && m==0)
        return 1;

        if(dp[n][m]!=-1)
        return dp[n][m];

        int up=helper(n-1,m,arr,dp);
        int left=helper(n,m-1,arr,dp);
        return dp[n][m]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][]=new int[n][m];
        for(int[] ele:dp)
        Arrays.fill(ele,-1);
        return helper(n-1,m-1,obstacleGrid,dp);
    }
}