class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0,right=0,dash=0;
        for(char c:moves.toCharArray())
        {
            if(c=='L') left++;
            else if(c=='R') right++;
            else if(c=='_') dash++;
        }
        return Math.abs(left-right)+dash;
    }
}