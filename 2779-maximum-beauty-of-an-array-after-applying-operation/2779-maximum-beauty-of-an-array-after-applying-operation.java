class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int max=0;
        for(int n:nums)
        {
            max=Math.max(max,n);
        }
        int res[]=new int[max+1];
        for(int n:nums)
        {
            res[Math.max(n-k,0)]++;
            res[Math.min(n+k+1,max)]--;
        }
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<res.length;i++)
        {
            currSum+=res[i];
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}