import java.util.HashMap;

class Solution {
    public long countGood(int[] nums, int k) {
        int pairs = 0;
        long res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            pairs += map.get(nums[j]) - 1;
            while (pairs >= k) {
                res += nums.length - j;
                map.put(nums[i], map.get(nums[i]) - 1);
                pairs -= map.get(nums[i]);
                i++;
            }
        }

        return res;
    }
}