class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3);
            if (isUnique(sub)) {
                count++;
            }
        }
        return count;
    }

    private boolean isUnique(String sub) {
        return sub.charAt(0) != sub.charAt(1) &&
               sub.charAt(0) != sub.charAt(2) &&
               sub.charAt(1) != sub.charAt(2);
    }
}
