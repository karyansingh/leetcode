class Solution {
    public boolean checkZeroOnes(String s) {
        int countZero = 0;
        int countOne = 0;
        int maxOne = 0;
        int maxZero = 0;

        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') { 
                countOne++;
                maxOne = Math.max(countOne, maxOne);
                countZero = 0; 
            } else if (s.charAt(i) == '0') { 
                countZero++;
                maxZero = Math.max(countZero, maxZero); 
                countOne = 0; 
            }
        }
        
        return maxOne > maxZero;
    }
}
