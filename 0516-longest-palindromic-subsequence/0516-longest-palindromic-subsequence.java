class Solution {
    public int longestPalindromeSubseq(String s) {
        int t[][]=new int[1001][1001];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            t[i][i]=1;
        }
        for(int l=2;l<=n;l++)
        {
            for(int i=0;i<n-l+1;i++)
            {
                int j=l+i-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    t[i][j]=2+t[i+1][j-1];
                }
                else 
                {
                    t[i][j]=Math.max(t[i+1][j],t[i][j-1]);
                    
                }
            }
        }
        return t[0][n-1];
    }
}