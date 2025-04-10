class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=1;
        int length=0;
        while(r<n)
        {
            int diff=nums[r]-nums[l];
            if(diff==1)
            {
                length=Math.max(length,r-l+1);
            }
            if(diff<=1)
            r++;
            else
            l++;
        }
        return length;
    }
}