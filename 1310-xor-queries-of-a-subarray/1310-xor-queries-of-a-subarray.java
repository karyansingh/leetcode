class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int ans=0;
            for(int j=queries[i][0];j<=queries[i][1];j++)
            {
                ans=ans^arr[j];
            }
            res[i]=ans;
        }
        return res;
    }
}