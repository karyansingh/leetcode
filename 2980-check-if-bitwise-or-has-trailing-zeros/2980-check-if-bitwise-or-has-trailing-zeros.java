class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int evenCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                evenCount++;
            }
        }
        return evenCount>=2?true:false;
    }
}