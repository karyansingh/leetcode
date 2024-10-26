class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        solve(res,new ArrayList<Integer>(),nums);
        return res;
    }
    public void solve(List<List<Integer>>res,List<Integer>temp,int []nums)
    {
        //base case
        if(temp.size()==nums.length)
        {
            res.add(new ArrayList(temp));
            return;
        }
        for(int n:nums)
        {
            //skip if the list contains the same no 
            if(temp.contains(n))
                continue;
            //Add the new element
            temp.add(n);
            //go back and try to fetch other element
            solve(res,temp,nums);
            //remove the element
            temp.remove(temp.size()-1);


        }
    }
}