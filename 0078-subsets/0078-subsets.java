class Solution {
    List<List<Integer>> result;

    void solve(int index, int nums[], List<Integer> temp) {
        // Base Case
        if (index >= nums.length) {
            result.add(new ArrayList<>(temp)); // Add a deep copy of temp
            return;
        }
        // Include the current element
        temp.add(nums[index]);
        solve(index + 1, nums, temp);
        // Exclude the current element
        temp.remove(temp.size() - 1);
        solve(index + 1, nums, temp);
    }

    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>(); // Initialize result here
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, temp);
        return result;
    }
}
