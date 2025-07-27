import java.util.*;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums); // ascending
        int total = 0;
        for (int n : nums) total += n;

        List<Integer> result = new ArrayList<>();
        int currSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            currSum += nums[i];
            result.add(nums[i]);
            if (currSum > total - currSum) break;
        }

        return result;
    }
}
