class Solution {
    public int minimumPushes(String word) {
        
        int []freq=new int[26];
        // counting the frequencies of the character
        for(char c:word.toCharArray())
        {
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int count=0;
        int keyPress=0;
        //Iterating over the frequencies array
        for(int i=25;i>=0;i--)
        {
            int mul=0;
            if(count<8)
            {
                mul=1;
            }
           else if(count<16)
           {
                mul=2;
           }
           else if(count<24)
           {
                mul=3;
           }
           else
           {
                mul=4;
           }
           keyPress+=mul*freq[i];
           count++;
        }
        return keyPress;
    }
}