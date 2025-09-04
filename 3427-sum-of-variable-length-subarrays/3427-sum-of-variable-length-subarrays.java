class Solution {
    public int subarraySum(int[] nums) {
        int start = 0;
        int total = 0;
        for(int i=0;i<nums.length;i++)
        {
            start = Math.max(0,i-nums[i]);
            total += sumArr(nums,start,i);

        }
        return total;
    }
    public int sumArr(int[] nums, int start, int end)
    {
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            sum += nums[i];
        }
        return sum;
    }
}