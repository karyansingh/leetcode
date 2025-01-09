class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String str : words)
        {
            if(str.length()<=s.length() && str.equals(s.substring(0,str.length())))
            {
                count++;
            }
             if(str.length()>s.length() && str.equals(str.substring(0,s.length())))
            {
                count++;
            }

        }
        return count;
    }
}