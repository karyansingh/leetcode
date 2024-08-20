class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int res[]=new int[capacity.length];
        int count=0;
        for(int i=0;i<capacity.length;i++)
        {
            res[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(res);
        for(int i=0;i<res.length;i++)
        {
            if(res[i]==0)
            {
                count++;

            }
            else if(res[i]<=additionalRocks)
            {
                count++;
                additionalRocks -=res[i];
            }
        }
        return count;
    }
}