class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count = 0;
        for (String s : words) {
            if (pref.length()<=s.length() && s.substring(0, n).equals(pref)) {
                count++;
            }
        }
        return count;
    }
}
