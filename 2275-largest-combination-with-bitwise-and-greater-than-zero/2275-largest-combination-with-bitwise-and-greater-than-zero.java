class Solution {
    public int largestCombination(int[] candidates) {
        int bitCount[] = new int[32];
        for (int ele : candidates) {
            for (int i = 0; i < 32; i++) {
                if ((ele & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        int max = 0;
        for (int count : bitCount) {
            max = Math.max(max, count);
        }
        return max;
    }
}
