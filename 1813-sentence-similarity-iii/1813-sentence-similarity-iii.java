class Solution {
    public boolean areSentencesSimilar(String str1, String str2) {
        // so now here we can do two thing 
        // wait first of all make teh str1 always smaller here
        if(str2.length() < str1.length()){
            return areSentencesSimilar(str2 , str1);
        }
        // so now here the apporach is we split the array and we compare from the staring and the end here
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        // so now here we have to get the front and back from the each array here
        int f1 = 0; int f2 = 0;
        // and count from the backe here
        int b1 = s1.length-1; int b2 = s2.length-1;
        // so now here we have got both here 
        while(f1 <= b1){
            // so now here is the simple thing we will compare from the staring or the back 
            if(s1[f1].equals(s2[f2])){
                f1++;
                f2++;
            }
            else if(s1[b1].equals(s2[b2])){
                b1--;
                b2--;
            }else{
                // so now in the other case it means sentence are not similar here so we have to 
                // return false becuase either it have get at the 
                // while case and in this string has been only made when we have got the 
                return false;
            }
        }
        return true;
    }
}