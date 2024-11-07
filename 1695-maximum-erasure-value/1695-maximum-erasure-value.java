class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;int r=0;
        int sum=0;int maxSum=0;
        Set<Integer>set=new HashSet<>();
        while(r<nums.length)
        {
            while(set.contains(nums[r]))
            {
                set.remove(nums[l]);
                sum=sum-nums[l];
                l++;
            }
            set.add(nums[r]);
            sum=sum+nums[r];
            maxSum=Math.max(maxSum,sum);
            r=r+1;
        }
        return maxSum;
    }
}