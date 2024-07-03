class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==2)return cost[0]+cost[1];
        
        int ans=0;
        Arrays.sort(cost);
        if(cost.length==3)return cost[1]+cost[2];
        int n= cost.length-1;
        if(cost.length%2==0)
        {
            for(int i=n;i>0;i=i-3)
            {
                ans=ans+cost[i]+cost[i-1];
            }
        }
        else
        {
            for(int i=n;i>0;i=i-3)
            {
                ans=ans+cost[i]+cost[i-1];
            }
            ans=ans+cost[0];
        }
        return ans;
    }
}
