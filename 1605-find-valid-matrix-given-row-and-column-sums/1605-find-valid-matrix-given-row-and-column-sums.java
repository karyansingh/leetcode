class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length,m=colSum.length;
        int res[][]=new int[m][n];

        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            res[i][j]=Math.min(rowSum[i],colSum[j]);
            rowSum[i]-=res[i][j];
            colSum[j]-=res[i][j];

            if(rowSum[i]==0)
            i++;
            else if(colSum[j]==0)
            j++;
        }
        return res;
    }
}