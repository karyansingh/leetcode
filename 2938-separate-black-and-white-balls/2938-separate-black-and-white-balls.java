class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        int left = 0;
        int right = 0;
        
        while (right < s.length()) {
            if (s.charAt(right) == '0') {
                count += right - left;
                left++;
            }
            right++;
        }
        
        return count;
    }
}
