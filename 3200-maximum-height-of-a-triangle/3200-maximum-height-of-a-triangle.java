public class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        
        if (red == 1 && blue == 1) {
            return 1;  
        }
        
        int i = 1, j = 1;
        
        // WHEN RED COMES FIRST
        int r1 = 1, b1 = 2;
        int totalRed1 = 1, totalBlue1 = 2;
        int count1 = 1;
        
        while (r1 <= red && b1 <= blue && totalRed1 <= red && totalBlue1 <= blue) {
            count1++;
            if (i % 2 == 1) {
                r1 = r1 + 2;
                totalRed1 += r1;
                i++;
            } else {
                b1 = b1 + 2;
                totalBlue1 += b1;
                i++;
            }
        }
        
        // WHEN BLUE COMES FIRST
        int r2 = 2, b2 = 1;
        int totalRed2 = 2, totalBlue2 = 1;
        int count2 = 1;
        
        while (r2 <= red && b2 <= blue && totalRed2 <= red && totalBlue2 <= blue) {
            count2++;
            if (j % 2 == 1) {
                b2 = b2 + 2;
                totalBlue2 += b2;
                j++;
            } else {
                r2 = r2 + 2;
                totalRed2 += r2;
                j++;
            }
        }
        
        return Math.max(count1, count2);
    }
}



