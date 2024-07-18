class Solution {
    public List<String> validStrings(int n) {
//         edge case
        if(n==1){
            List<String> res = new ArrayList<>();
            res.add("0");
            res.add("1");
            return res;
        }
        
//         for others n
        
//         result
        List<String> list = new ArrayList<>();
        
//         recursion
        List<String> recu_list = validStrings(n-1);
        
//         solve it
        for(var rl:recu_list){
            if(rl.charAt(rl.length()-1)=='1'){
                list.add(rl+"0");
            }
            list.add(rl+"1");
        }
        return list;
        
    }
}