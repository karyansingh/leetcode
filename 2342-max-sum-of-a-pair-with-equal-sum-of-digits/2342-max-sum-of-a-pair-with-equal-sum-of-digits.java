class Solution {
    int getDigitSum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=-1;
        for(int n:nums)
        {
            int digitSum=getDigitSum(n);
            if(map.containsKey(digitSum))
            {
                ans=Math.max(ans,map.get(digitSum)+n);
                map.put(digitSum,Math.max(n,map.get(digitSum)));
            }
            else
            {
                map.put(digitSum,n);
            }
        }
        return ans;
    }
}