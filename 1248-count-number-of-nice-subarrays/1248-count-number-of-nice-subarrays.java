
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countLessThanEqualToK(nums, k) - countLessThanEqualToK(nums, k - 1);
    }

    public int countLessThanEqualToK(int[] nums, int k) {
        int i = 0; 
        int count = 0; 
        int oddCount = 0; 
        
        for (int j = 0; j < nums.length; j++) { 
            if (nums[j] % 2 == 1) 
                oddCount++; 
            
            // While the number of odd elements exceeds 'k', move the left pointer to the right
            while (oddCount > k) {
                if (nums[i] % 2 == 1) 
                    oddCount--; 
                i++; 
            } 
            
            count += j - i + 1;
        }
        
        return count; 
    }
}