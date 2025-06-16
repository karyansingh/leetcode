class Solution {
    public int maximumDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=0,maxIndex=0;
        int res=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;
            }
            else if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
            if(minIndex<maxIndex)
            {
                res=max-min;
            }

        }
        return res;
    }
}