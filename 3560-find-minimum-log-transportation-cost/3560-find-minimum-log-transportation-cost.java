class Solution {
    public long minCuttingCost(int n, int m, int k) {
        int cost=0;
        if(n>k)
        {
            cost=cost+((n-k)*k);
        }
        if(m>k)
        {
            cost=cost+((m-k)*k);
        }
        return cost;
    }
}