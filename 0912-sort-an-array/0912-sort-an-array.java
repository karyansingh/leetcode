class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void merge(int nums[],int left,int right,int mid)
    {
        int temp[]=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right)
        {
            if(nums[i]<nums[j])
            {
                temp[k]=nums[i];
                i++;

            }
            else
            {
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=nums[i++];

        }
        while(j<=right)
        {
            temp[k++]=nums[j++];
            
        }
        for(int z=0;z<temp.length;z++)
        {
            nums[left+z]=temp[z];
        }
    }
    public void sort(int nums[],int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            sort(nums,left,mid);
            sort(nums,mid+1,right);
            merge(nums,left,right,mid);
        }
    }
}