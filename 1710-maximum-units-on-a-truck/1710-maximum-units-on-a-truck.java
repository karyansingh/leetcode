class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int total=0;
        Arrays.sort(boxTypes,(a,b)->Integer.compare(a[1],b[1]));
        for(int i=boxTypes.length-1;i>=0;i--)
        {
            if(truckSize==0)
            {
                return total;
            }
            if(truckSize>=boxTypes[i][0])
            {
                total +=boxTypes[i][1]*boxTypes[i][0];
                truckSize=truckSize-boxTypes[i][0];
            }
            else if(truckSize<boxTypes[i][0])
            {
                total +=boxTypes[i][1]*truckSize;
                truckSize=0;
            }
        }
        return total;
    }
}