class Solution {
    int arrayCount(int [] arr)
    {
        int cons=0;
        int subCount=0;
        for(int val:arr)
        {
            if(val==0)
            {
                cons=0;
            }
            else{
                cons++;
            }
            subCount +=cons;

        }
        return subCount;
    }
    public int numSubmat(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int result=0;
        for(int i=0;i<m;i++)
        {
            int arr[]=new int[n];
            Arrays.fill(arr,1);
            for(int j=i;j<m;j++)
            {
                for(int k=0;k<n;k++)
                {
                    arr[k]=arr[k]&mat[j][k];
                }
                result +=arrayCount(arr);
            }
        }
        return result;
    }
}