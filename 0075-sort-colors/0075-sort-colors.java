class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3]; // Array to count occurrences of 0, 1, and 2
        for (int num : nums) {
            counts[num]++;
        }
        
        int i = 0;
        for (int color = 0; color <= 2; color++) {
            for (int j = 0; j < counts[color]; j++) {
                nums[i++] = color;
            }
        }
    }
}
