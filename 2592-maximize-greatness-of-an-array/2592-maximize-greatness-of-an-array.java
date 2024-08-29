class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0,j=1;j<nums.length;j++)
        {
            if(nums[i]<nums[j])
            {
                ans++;
                i++;
            }
        }
        return ans;
    }
}