class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len=1;int ans=1;
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[i]<nums[j])
            {
                len++;
                ans=Math.max(ans,len);
                j++;
                i++;
            }
            else
            {
                len=1;
                j++;
                i++;
            }
        }
        return ans;
    }
}