class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int l=0;
        int r=skill.length-1;
        int sum=skill[l]+skill[r];
        long res=0;
        while(l<=r)
        {
            if(skill[l]+skill[r]==sum)
            {
                res+=(long)(skill[l]*skill[r]);
                l++;
                r--;
            }
            else
            return -1;
        }
        return res;
    }
}