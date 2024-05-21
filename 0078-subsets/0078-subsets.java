class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>resultList=new ArrayList<>();
        //backtracking from the begning
        backtrack(resultList,new ArrayList<>(),nums,0);
        return resultList;

    }
    private void backtrack(List<List<Integer>>resultSets,List<Integer>tempSet,
    int []nums,int start)
    {
        //Add result to result set
        resultSets.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++)
        {
            //including the number
            tempSet.add(nums[i]);

            //backtrack the new subset
            backtrack(resultSets,tempSet,nums,i+1);

            //not including
            tempSet.remove(tempSet.size()-1);
        }
    }
}