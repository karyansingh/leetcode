class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1)return 0;
        int mid=nums[n/2];
        int moves=0;
        for(int num:nums)
        {
            moves +=Math.abs(num-mid);
        }
        return moves;
    }
}