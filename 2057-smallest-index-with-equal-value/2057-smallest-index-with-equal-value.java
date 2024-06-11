class Solution {
    public int smallestEqual(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i%10==nums[i])
            {
                if(i<=res)
                {
                    res=i;
                }
            }
        }
        if(res==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        return res;
    }
}