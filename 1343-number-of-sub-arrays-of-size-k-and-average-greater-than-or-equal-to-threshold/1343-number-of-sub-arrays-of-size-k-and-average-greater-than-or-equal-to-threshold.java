class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int currSum = 0;
        int left = 0;
        int count = 0;
        int targetSum = k * threshold;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        // Check the first window
        if (currSum >= targetSum) {
            count++;
        }

        for (int right = k; right < arr.length; right++) {
            currSum += arr[right] - arr[left];
            left++;
            if (currSum >= targetSum) {
                count++;
            }
        }

        return count;
    }
}
