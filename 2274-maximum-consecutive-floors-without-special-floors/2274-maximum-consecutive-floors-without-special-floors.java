class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int max=Integer.MIN_VALUE;
        int n=special.length;
        Arrays.sort(special);
        max=Math.max(max,special[0]-bottom);
        max=Math.max(max,top-special[n-1]);
        for(int i=1;i<=n-1;i++)
        {
            max=Math.max(special[i]-special[i-1]-1,max);
        }
        return max;
    }
}