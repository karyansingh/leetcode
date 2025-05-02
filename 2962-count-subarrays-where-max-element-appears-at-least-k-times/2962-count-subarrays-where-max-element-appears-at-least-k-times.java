class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxElement=Math.max(nums[i],maxElement);
        }
        int start=0,end=0;
        long count=0,maxFreqCount=0;
        while(end<nums.length)
        {
            if(nums[end]==maxElement)
            {
                maxFreqCount++;
            }
            while(maxFreqCount==k)
            {
                count=count+(nums.length-end);
                if(nums[start]==maxElement)
                {
                    maxFreqCount--;
                }
                start++;
            }
            end++;
        }
        return count;
    }
}