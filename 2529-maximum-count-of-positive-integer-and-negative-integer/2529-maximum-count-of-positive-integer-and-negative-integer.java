class Solution {
    public int maximumCount(int[] nums) {
        int countPos=0;
        int countNeg=0;
        for(int n: nums)
        {
            if(n>0)
            {
                countPos++;
            }
            else if(n<0)
            {
                countNeg++;
            }
        }
        return Math.max(countNeg,countPos);
    }
}