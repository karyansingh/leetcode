class Solution {
    public int findPrime(int n)
    {
        int sum=0;
        while(n%2==0)
        {
            sum +=2;
            n=n/2;
        }
        for(int i=3;i<Math.sqrt(n);i=i+2)
        {
            while(n%i==0)
            {
                sum +=i;
                n=n/i;
            }
        }
        if(n>2)
        sum +=n;
        return sum;
    }
    public int smallestValue(int n) {
        int x=Integer.MAX_VALUE;
        while(x!=findPrime(n))
        {
            x=findPrime(n);
            n=x;
        }
        return x;
    }
}