class Solution {
    public boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int minPos=Integer.MAX_VALUE;
        int maxPos=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(nums[i]))
            {
                minPos=Math.min(minPos,i);
                maxPos=Math.max(maxPos,i);
            }
        }
        return maxPos-minPos;
    }
}