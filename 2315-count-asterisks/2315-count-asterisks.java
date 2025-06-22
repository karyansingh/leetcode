class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean betweenBars = false;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                betweenBars = !betweenBars; 
            } else if (c == '*' && !betweenBars) {
                count++;
            }
        }
        return count;
    }
}