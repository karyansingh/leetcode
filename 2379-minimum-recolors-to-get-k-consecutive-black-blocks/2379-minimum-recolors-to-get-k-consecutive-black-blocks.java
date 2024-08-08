class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int white = 0, black = 0;
        int minRecolors = n; // Initialize with the worst case

        // Calculate initial counts
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                white++;
            } else {
                black++;
            }
        }

        minRecolors = Math.min(minRecolors, Math.min(white, black));

        // Sliding window
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') {
                white--;
            } else {
                black--;
            }
            if (blocks.charAt(i) == 'W') {
                white++;
            } else {
                black++;
            }
            minRecolors = Math.min(minRecolors, Math.min(white, black));
        }

        return minRecolors;
    }
}
