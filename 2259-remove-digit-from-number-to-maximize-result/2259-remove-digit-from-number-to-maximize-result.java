class Solution {
    public String removeDigit(String number, char digit) {
        int counter = 0, len = number.length();
        for(char c : number.toCharArray())if(c == digit)counter++;
        if(counter == len)return number.substring(0,number.length()-1);

        String current = "";
        
        for(int i=0;i<len;i++){
            if(number.charAt(i) == digit){
                String temp = number.substring(0,i);
                if(i+1 < len)temp += number.substring(i+1, len);

                if(current == null || len == 0)current = temp;
                else if(current.compareTo(temp) < 0)current = temp;


            }
        }
        return current;
    }
}