class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Integer[] res=new Integer[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            res[i]=nums[i];
        }

        Arrays.sort(res,(a,b)->
        {
            if(map.get(a)!=map.get(b))
            return map.get(a)-map.get(b);
            else
            return b-a;
        });
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(int)res[i];
        }
        return nums;
    }
}