class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int max=0;
        int curr=0;
        for(int i=0;i<minutes;i++)
        {
            curr+=customers[i]*grumpy[i];
        }
        max=curr;
        int j=minutes;
        int i=0;
        while(j<n)
        {
            curr+=customers[j]*grumpy[j];
            curr-=customers[i]*grumpy[i];
            max=Math.max(curr,max);
            i++;
            j++;
            
        }
        int total=max;
        for(int k=0;k<n;k++)
        {
            if(grumpy[k]==0)
            {
                total+=customers[k]*(1-grumpy[k]);
            }
        }
        return total;
    }
}