class Solution {
    public int findComplement(int num) {
        
        if (num == 0) return 1;
        
        
        int bitLength = (int)(Math.log(num) / Math.log(2)) + 1;
        
    
        int mask = (1 << bitLength) - 1;
        
        
        return num ^ mask;
    }
}
