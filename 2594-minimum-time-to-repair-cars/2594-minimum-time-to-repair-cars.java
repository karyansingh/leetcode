class Solution {
    public boolean isPossible(long mid, int[] ranks, int cars) {
        long count = 0;
        for (int n : ranks) {
            count += (long) Math.sqrt(mid / (double) n);
            if (count >= cars) return true; // Early exit optimization
        }
        return count >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long high = (long) cars * cars * ranks[0]; // Upper bound estimate
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2; // Avoid overflow
            if (isPossible(mid, ranks, cars)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
