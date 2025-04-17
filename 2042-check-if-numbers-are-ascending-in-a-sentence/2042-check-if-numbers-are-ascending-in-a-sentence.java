class Solution {
    public boolean areNumbersAscending(String s) {
        int lastSeen = Integer.MIN_VALUE;
        String[] tokens = s.split(" ");

        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                int num = Integer.parseInt(token);
                if (num <= lastSeen) {
                    return false;
                }
                lastSeen = num;
            }
        }

        return true;
    }
}
