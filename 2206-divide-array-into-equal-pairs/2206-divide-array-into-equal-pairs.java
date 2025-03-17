class Solution {
    public boolean divideArray(int[] nums) {
        if ((nums.length) % 2 != 0) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int c : nums) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
