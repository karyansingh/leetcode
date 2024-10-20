class Solution {
    int mod=(int)1e9 +7;
    public boolean check(int n){
        if(n==2){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        int len=(int)Math.sqrt(n);
        for(int i=3;i<=len;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public long fact(int n){
        long mul=1;
        for(int i=2;i<=n;i++){
            mul=(mul*i)%mod;
        }
        return mul;
    }
    public int numPrimeArrangements(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            if(check(i)){
                count++;
            }
        }
        int x=n-count;
        long f1=fact(count)%mod;
        long f2=fact(x)%mod;
        return (int)((f1*f2)%mod);
    }
}