class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            int divsum=0;
            for(int j=1;j<=Math.sqrt(nums[i]);j++){
                if(nums[i]%j==0){
                    cnt++;
                    divsum+=j;
                    if(j!=nums[i]/j){
                        cnt++;
                        divsum+=nums[i]/j;
                    }
                }
                if(cnt>4)break;
            }
            if(cnt==4)sum+=divsum;
        }    
        return sum;
    }
}