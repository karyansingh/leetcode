class Solution {
    public int[] diStringMatch(String s) {
        
        int high=s.length();
        int low=0;
        int res[]=new int[high+1];
        for(int i=0;i<s.length();i++)
        
        {
            if(s.charAt(i)=='I')
            {
                res[i]=low;
                low++;
            }
            else if(s.charAt(i)=='D')
            {
                res[i]=high;
                high--;
            }
        }
        res[s.length()]=high;
        return res;

    }
}