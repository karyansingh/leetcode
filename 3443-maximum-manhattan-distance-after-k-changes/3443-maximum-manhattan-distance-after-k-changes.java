class Solution {
    public int maxDistance(String s, int k) {
        int maxDist=0;
        int north=0;
        int south=0;
        int east=0;
        int west=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            {
                north++;
            }
             else if(s.charAt(i)=='S')
            {
                south++;
            }

             else if(s.charAt(i)=='E')
            {
                east++;
            }
             else if(s.charAt(i)=='W')
            {
                west++;
            }

            int currDist=Math.abs(east-west)+Math.abs(north-south);
            int wasteDist=i+1-currDist;
            int extra=0;
            if(wasteDist!=0)
            {
                extra=Math.min(2*k,wasteDist);
            }
            int finalDist=currDist+extra;
            maxDist=Math.max(maxDist,finalDist);
        }
        return maxDist;
    }
}