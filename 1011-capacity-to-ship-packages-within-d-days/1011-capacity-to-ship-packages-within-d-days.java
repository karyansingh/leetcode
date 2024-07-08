class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=0;
        int maxCap=0;
        //Calculating the minimum and maximum capacity
        for(int weight:weights)
        {
            minCap=Math.max(minCap,weight);
            maxCap+=weight;
        }
        //Applying binary search
        while(minCap<maxCap)
        {
            int mid=minCap+(maxCap-minCap)/2;
            int day=1;
            int sum=0;
            for(int weight:weights)
            {
                if(sum+weight>mid)
                {
                    day++;
                    sum=0;
                }
                sum=sum+weight;
            }
            if(day>days)
            {
                minCap=mid+1;

            }
            else
            {
                maxCap=mid;
            }
            
        }
        return minCap;
    }
}