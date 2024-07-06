class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalSum = 0;
        for (int i = 0; i < chalk.length; i++) {
            totalSum += chalk[i];
        }
        
        if (totalSum == 0) {
            return -1; // No chalk available
        }
        
        long longK = k; // Convert k to long to avoid overflow issues
        
        long cycles = longK / totalSum;
        long remaining = longK % totalSum;
        
        for (int i = 0; i < chalk.length; i++) {
            if (remaining < chalk[i]) {
                return i;
            }
            remaining -= chalk[i];
        }
        
        // If remaining is exactly 0, return the last index
        return chalk.length - 1;
    }
}
