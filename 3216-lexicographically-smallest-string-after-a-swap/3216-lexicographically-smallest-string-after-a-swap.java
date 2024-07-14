class Solution {
    public String getSmallestString(String s) {
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {
            if((ch[i]%2==0)&&(ch[i+1]%2==0) && ch[i]>ch[i+1])
            {
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
                break;
            }

           else if((ch[i]%2!=0)&&(ch[i+1]%2!=0) && ch[i]>ch[i+1])
            {
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
                break;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ch.length;i++)
        {
            str.append(ch[i]);
        }
        return str.toString();
    }
}