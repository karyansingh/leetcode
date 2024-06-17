class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false; // negative number cannot be represented as sum of squares
        long left = 0;
        long right = (long) Math.sqrt(c); // cast to long since right is a long
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
