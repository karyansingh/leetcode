class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int zeroCount = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) 
        {
            // If we encounter a zero, increment zeroCount
            if (nums[right] == 0) 
            {
                zeroCount++;
            }

            // If we have more than k zeros, shrink the window from the left
            while (zeroCount > k) 
            {
                if (nums[left] == 0) 
                {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum length of the window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
