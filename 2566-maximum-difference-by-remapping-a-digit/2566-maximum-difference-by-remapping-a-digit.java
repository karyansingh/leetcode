class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        char ch = '\0';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '9') {
                ch = str.charAt(i);
                break;
            }
        }
        char ch2=str.charAt(0);
        String maxStr = str.replace(ch, '9');
        String minStr = str.replace(ch2, '0');

        int maxNum = Integer.parseInt(maxStr);
        int minNum = Integer.parseInt(minStr);

        return maxNum - minNum;
    }
}