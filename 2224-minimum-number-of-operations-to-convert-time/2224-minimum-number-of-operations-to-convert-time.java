class Solution {
    public int convertTime(String current, String correct) {
        int currTime = 60 * Integer.parseInt(current.substring(0, 2)) + Integer.parseInt(current.substring(3, 5));
        int corrTime = 60 * Integer.parseInt(correct.substring(0, 2)) + Integer.parseInt(correct.substring(3, 5));

        int diff = corrTime - currTime;
        int count = 0;
        int[] steps = {60, 15, 5, 1};

        for (int step : steps) {
            count += diff / step;
            diff %= step;
        }
        
        return count;
    }
}