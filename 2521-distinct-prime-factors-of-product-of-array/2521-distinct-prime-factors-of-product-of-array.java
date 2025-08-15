import java.util.*;

class Solution {
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        
        for (int n : nums) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0 && isPrime(i)) {
                    s.add(i);
                }
            }
        }
        
        return s.size();
    }
}