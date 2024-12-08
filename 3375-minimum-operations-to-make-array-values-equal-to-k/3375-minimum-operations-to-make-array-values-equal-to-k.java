class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        if(nums[0]<k)
            return -1;

        else if(nums[0]>k)
        {
            count++;
        }

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>k && nums[i-1]!=nums[i] )
            {
                count++;
            }
        }
        return count;
    }
}