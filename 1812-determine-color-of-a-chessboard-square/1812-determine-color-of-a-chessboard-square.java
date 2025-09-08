class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a'; // 0 to 7
        int row = coordinates.charAt(1) - '1'; // 0 to 7
        return (col + row) % 2 != 0;
    }
}
