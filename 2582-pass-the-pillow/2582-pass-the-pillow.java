class Solution {
    public int passThePillow(int n, int time) 
    {
        int rem=0;
        int que=0;
        rem=time%(n-1);
        que=time/(n-1);
        return que%2==0 ? rem+1 : n-rem;
    }
}
