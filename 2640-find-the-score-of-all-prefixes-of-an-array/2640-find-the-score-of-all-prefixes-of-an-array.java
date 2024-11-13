class Solution {
    public long[] findPrefixScore(int[] nums) {
        long max[]=new long[nums.length];
        max[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max[i]=Math.max(nums[i],max[i-1]);
        }
        long score[]=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            score[i]=max[i]+nums[i];
        }
        for(int i=1;i<nums.length;i++)
        {
            score[i]=score[i]+score[i-1];
        }
        return score;
    }
}