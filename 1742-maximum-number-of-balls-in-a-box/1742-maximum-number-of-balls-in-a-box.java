import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = lowLimit; i <= highLimit; i++) { 
            int num = sumOfDigit(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (int value : map.values()) {  
            max = Math.max(max, value);
        }

        return max;
    }
}
