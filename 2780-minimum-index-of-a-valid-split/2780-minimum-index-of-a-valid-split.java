class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer>map1=new HashMap<>();
        Map<Integer,Integer>map2=new HashMap<>();
        for(int n:nums)
        {
            map2.put(n,map2.getOrDefault(n,0)+1);
        }
        for(int i=0;i<nums.size();i++)
        {
            int num=nums.get(i);
            map1.put(num,map1.getOrDefault(num,0)+1);
            map2.put(num,map2.get(num)-1);
            //check the condition
            if(map1.get(num)>(i+1)/2 && map2.get(num)>(nums.size()-i-1)/2)
            {
                return i;
            }
        }
        return -1;
    }
}