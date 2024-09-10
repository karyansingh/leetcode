class Solution {
    public boolean isSameAfterReversals(int num) {
        int num1=reverse(num);
        System.out.print(num1);
        int num2=reverse(num1);
        if(num2==num)
        {
            return true;
        }
        return false;
    }
    public int reverse(int num)
    {
        int n=0;
        while(num!=0)
        {
            int rem=num%10;
            n=(rem+n)*10;
            num=num/10;
        }
        return n/10;
    }
}