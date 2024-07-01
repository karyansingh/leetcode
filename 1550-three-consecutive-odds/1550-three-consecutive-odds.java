class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int p1=0,p2=1,p3=2;
        for(int i=0;i<arr.length-3;i++)
        {
            if(arr[p1]%2!=0 && arr[p2]%2!=0 && arr[p3]%2!=0)
            {
                return true;
            }
            p1++;
            p2++;
            p3++;

        }
        return false;
    }
}