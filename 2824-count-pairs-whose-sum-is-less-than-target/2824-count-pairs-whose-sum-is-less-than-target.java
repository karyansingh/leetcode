class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n = nums.size();
        int count = 0;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            while (i < j && nums.get(i) + nums.get(j) >= target) {
                j--;
            }
            count += Math.max(0, j - i);
        }
        return count;
    }
}