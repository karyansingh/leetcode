import java.util.Arrays;

class Solution {
    public int splitNum(int num) {
        // Convert the number to a character array of its digits
        char[] arr = Integer.toString(num).toCharArray();
        
        // Sort the character array
        Arrays.sort(arr);
        
        // Create two strings to build two parts
        StringBuilder firstPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder();
        
        // Distribute sorted digits into two parts
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                firstPart.append(arr[i]);
            } else {
                secondPart.append(arr[i]);
            }
        }
        
        // Convert these parts to integers and sum them up
        int num1 = Integer.parseInt(firstPart.toString());
        int num2 = Integer.parseInt(secondPart.toString());
        
        return num1 + num2;
    }
}