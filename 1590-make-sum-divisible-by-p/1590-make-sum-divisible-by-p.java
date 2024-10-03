import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum = (totalSum + num) % p;
        }
        if (totalSum == 0) return 0;

        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, -1);
        int currentSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            currentSum = (currentSum + nums[i]) % p;
            int target = (currentSum - totalSum + p) % p;
            if (prefixSumMap.containsKey(target)) {
                minLength = Math.min(minLength, i - prefixSumMap.get(target));
            }
            prefixSumMap.put(currentSum, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}
