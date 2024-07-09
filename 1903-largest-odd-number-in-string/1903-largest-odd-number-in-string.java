class Solution {
    public String largestOddNumber(String num) {
        
        char[] ch = num.toCharArray();
        StringBuilder s=new StringBuilder();
        int oddPoint=-1;
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]%2!=0)
            {
                oddPoint=i;
                break;
            }
        }
        if(oddPoint!=-1)
        {
            for(int i=0;i<=oddPoint;i++)
            {
                s.append(ch[i]);
            }
            return s.toString();
        }
        return "";
    }
}