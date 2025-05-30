class Solution {
    public int minInsertions(String s) {
        int t[][]=new int[501][501];
        int n=s.length();
        for(int L=2;L<=n;L++)
        {
            
            for(int i=0;i<n-L+1;i++)
            {
                int j=i+L-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    t[i][j]=t[i+1][j-1];

                }
                else
                {
                    t[i][j]=1+Math.min(t[i+1][j],t[i][j-1]);
                }
            }
        }
        return t[0][n-1];
    }
}