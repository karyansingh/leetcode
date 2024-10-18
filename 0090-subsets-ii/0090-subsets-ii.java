import java.util.*;

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
        // Skip duplicates
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        solve(index + 1, nums, temp);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>(); // Initialize result here
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, temp);
        return result;
    }
}
