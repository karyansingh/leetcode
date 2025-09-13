class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch: s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int vowelCount=0,constCount=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
            if(entry.getKey()=='a'|| entry.getKey()=='e' || entry.getKey()=='i' || entry.getKey()=='o' || entry.getKey()=='u')
            {
                vowelCount=Math.max(entry.getValue(),vowelCount);
            }
            else
            {
                constCount=Math.max(entry.getValue(),constCount);
            }
        }
        return vowelCount+constCount;

    }
}