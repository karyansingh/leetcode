class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int num=0;
            int mul=1;
            if(temp==0)
            num=mapping[0];
            else
            while(temp>0)
            {
                int rem=temp%10;
                num=mapping[rem]*mul+num;
                mul*=10;
                temp/=10;
            }
            hm.put(nums[i],num);
        }
        Integer[] res=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(res,(a,b)->Integer.compare(hm.get(a),hm.get(b)));
        for(int i=0;i<nums.length;i++)
        nums[i]=res[i];
        return nums;
    }
}