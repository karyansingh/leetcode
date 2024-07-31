class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=0;
        int totalDiff=0,fuel=0;
        for(int i=0;i<gas.length;i++)
        {
            int diff=gas[i]-cost[i];
            totalDiff +=diff;
            fuel=fuel+diff;
            if(fuel<0)
            {
                index=i+1;
                fuel=0;
            }
        }
        return totalDiff<0?-1:index;
        
    }
}