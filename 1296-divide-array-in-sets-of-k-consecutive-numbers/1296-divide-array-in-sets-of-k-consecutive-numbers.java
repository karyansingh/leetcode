class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)
        {
            return false;
        }
        TreeMap<Integer, Integer>map = new TreeMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        while(map.size()>0)
        {
            int currElement=map.entrySet().iterator().next().getKey();
            for(int i=0;i<k;i++)
            {
                int n=currElement+i;
                if(!map.containsKey(n))
                {
                    return false;
                }
                //update the frequeny map;
                map.put(n,map.get(n)-1);
                //remove the card if frequency equals 0
                if(map.get(n)==0)
                {
                    map.remove(n);
                }
            }
        }
        return true;
    }
}