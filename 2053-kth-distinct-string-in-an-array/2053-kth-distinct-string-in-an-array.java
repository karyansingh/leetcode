class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++)
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

        for(Map.Entry ele:hm.entrySet())
        {
            if((int)ele.getValue()>=2)
            continue;
            else if((int)ele.getValue()==1)
            k--;
            if(k==0)
            return ele.getKey().toString();
        }
        return "";
    }
}