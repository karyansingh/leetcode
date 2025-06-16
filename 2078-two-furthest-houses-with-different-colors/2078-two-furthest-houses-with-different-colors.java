class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        int fromStart = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                fromStart = i;
                break;
            }
        }

        int fromEnd = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                fromEnd = n - 1 - i;
                break;
            }
        }

        return Math.max(fromStart, fromEnd);
    }
}
