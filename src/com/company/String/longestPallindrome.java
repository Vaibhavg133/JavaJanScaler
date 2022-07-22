package com.company.String;

public class longestPallindrome {
    public static void main(String[] args) {
        String a = "aaaabaaa";
        int len=Integer.MIN_VALUE;
        String pallindrome = "";
        int start=0;
        int maxLength=1;
        for(int i=0;i<a.length();i++)
        {
            for(int j=i;j<a.length();j++)
            {
                int flag=0;
                if(checkPallindrome(a,i,j))
                {
                    flag=1;
                }
                if(flag!=0 && (j-i+1)>maxLength)
                {
                    start=i;
                    maxLength=j-i+1;
                }
            }
        }
        for(int i=start;i<=maxLength;i++)
        {
            System.out.print(a.charAt(i));
        }
    }
    public static String palli(String a, int i, int j)
    {
        return a.substring(i,(j-i+1));
    }

    public static boolean checkPallindrome(String a, int i, int j)
    {
        boolean flag = true;
        char[] ch=a.toCharArray();
        int P1=i;
        int P2=j;
        while(P1<P2)
        {
            char c = ch[P1];
            ch[P1] = ch[P2];
            ch[P2] = c;
            P1++;
            P2--;
        }
        for(int k=0;k<a.length();k++)
        {
            if(a.charAt(k)!=ch[k])
            {
                return false;
            }
        }

        return true;
    }

    public static int expand(String str, int s, int e)
    {
        int P1=s;
        int P2=e;
        while(P1>=0 && P2<str.length() && str.charAt(P1)==str.charAt(P2))
        {
            P1--;
            P2++;
        }
        return P2-P1+1;
    }

}
