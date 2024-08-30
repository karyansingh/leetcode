class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;

        // Handle the edge case where k is greater than the string length
        if (k > str.length()) {
            return 0;
        }

        for (int i = 0; i <= str.length() - k; i++) {
            int val = Integer.parseInt(str.substring(i, i + k));
            if (val != 0 && num % val == 0) {
                count++;
            }
        }
        return count;
    }
}
