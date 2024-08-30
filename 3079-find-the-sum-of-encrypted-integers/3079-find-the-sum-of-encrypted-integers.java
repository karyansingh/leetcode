class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                int temp=nums[i];
                sum +=1*greatest(temp);
            }
            else if(nums[i]<100 && nums[i]>=10)
            {
                int temp=nums[i];
                sum +=11*greatest(temp);
            }
             else if(nums[i]<1000 && nums[i]>=100)
            {
                int temp=nums[i];
                sum +=111*greatest(temp);
            }
            else if(nums[i]==1000)
            {
                 int temp=nums[i];
                sum +=1111*greatest(temp);
            }


        }
        return sum;
    }
    public int greatest(int num)
    {
        int max=0;
        while(num!=0)
        {
            int rem=num%10;
            num=num/10;
            max=Math.max(max,rem);
        }
        return max;
    }
}