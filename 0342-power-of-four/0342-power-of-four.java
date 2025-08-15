class Solution {
    public boolean isPowerOfFour(int n) {
        int i=0;
        long num=1;
        while(num<=n)
        {
            num=(long)Math.pow(4,i);
            if(num==n)
            {
                return true;
            }
            i++;
        }
        return false;
        
    }
}