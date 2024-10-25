class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        solve(k,n,1,curr,res);
        return res;
    }
    public void solve(int k,int target,int element,List<Integer>curr,List<List<Integer>>res)
    {
        if(curr.size()>=k)
        {
            if(target==0)
            {
                res.add(new ArrayList<Integer>(curr));
                
            }
            return;
        }
        for(int el=element;el<=9;el++)
        {
            if(el<=target)
            {
                curr.add(el);
                solve(k,target-el,el+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
}