class Solution {
    public int heightChecker(int[] heights) {
        int dup[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            dup[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=dup[i])
            count++;
        }
        return count;

    }
}