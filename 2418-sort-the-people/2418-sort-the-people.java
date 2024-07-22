class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>();

        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        String[] res=new String[names.length];
        int i=names.length-1;
        for(Map.Entry ele:map.entrySet())
        {
            res[i--]=ele.getValue().toString();
        }
        return res;
    }
}