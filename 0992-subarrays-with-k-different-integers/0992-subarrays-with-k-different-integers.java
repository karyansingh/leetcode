import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        int left = 0, res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int right = 0; right < nums.length; ++right) {
            count.put(nums[right], count.getOrDefault(nums[right], 0) + 1);
            
            while (count.size() > k) {
                count.put(nums[left], count.get(nums[left]) - 1);
                if (count.get(nums[left]) == 0) count.remove(nums[left]);
                left++;
            }
            
            res += right - left + 1;  // Count valid subarrays in the window
        }
        return res;
    }
}