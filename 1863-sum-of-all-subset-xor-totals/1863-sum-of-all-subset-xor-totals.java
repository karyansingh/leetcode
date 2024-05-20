class Solution {
    public int subsetXORSum(int[] nums) {
        return xorSum(nums,0,0);
    }
    public int xorSum(int nums[], int level,int currentXor)
    {
        if(level==nums.length)
        {
            return currentXor;
        }
        int inc=xorSum(nums,level+1,currentXor^nums[level]);
        int exc=xorSum(nums,level+1,currentXor);
        return inc+exc;
    }
}