class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start=0;
        int maxlen=0;
        int mask=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            while((mask & nums[i])!=0)
            {
                mask=mask^nums[start];
                start++;
            }
            mask=mask|nums[i];
            maxlen=Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
}