class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(Math.abs(i-j)<=k && nums[j]==key)
                {
                    li.add(i);
                    break;
                }
            }
        }
        return li;
    }
}