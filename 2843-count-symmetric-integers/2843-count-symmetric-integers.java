class Solution {
    boolean isSymmetric(int n)
    {
        if(n<100)
        {
            int i1=n%10;
            int i2=n/10;
            return i1==i2;
        }
        else if(n>=1000)
        {
            int n1=n%10;
            n=n/10;
            int n2=n%10;
            n=n/10;
            int n3=n%10;
            int n4=n/10;
            return (n1+n2)==(n3+n4);
        }
        return false;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            if((i<10) || (i>=100 && i<1000))
            {
                continue;
            }
            else if(isSymmetric(i))
            {
                count++;
            }

        }
        return count;
    }
}