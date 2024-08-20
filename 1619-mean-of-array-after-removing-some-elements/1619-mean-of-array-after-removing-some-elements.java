class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int l=(5*n)/100;
        int r=n-(l);
        double sum=0;
        Arrays.sort(arr);
        for(int i=l;i<r;i++)
        {
            sum=sum+arr[i];
        }
        return (double)(sum)/((90*n)/100);
    }
}