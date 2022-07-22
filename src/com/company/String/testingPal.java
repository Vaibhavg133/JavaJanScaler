package com.company.String;

public class testingPal {
    public static void main(String[] args) {
        //String a = "aaaabaaa";
        //String a = "xabbaz";
        String a = "caba";

        if(isPallidrome(a))
        {
            System.out.println("Yes");
        }
        int P1=0, P2=0;
        int start = 0, end=1;
        for(int i=0;i<a.length();i++)
        {
               //even part
                P1=i-1;
                P2=i;
                while(P1>=0 && P2<a.length() && a.charAt(P1)==a.charAt(P2))
                {
                    if(P2-P1+1>end)
                    {
                        start=P1;
                        end=P2-P1+1;
                    }
                    P1--;
                    P2++;
                }
                //odd part
                P1=i;
                P2=i;
                while(P1>=0 && P2<a.length() && a.charAt(P1)==a.charAt(P2))
                {
                    if(P2-P1+1>end)
                    {
                        start=P1;
                        end=P2-P1+1;
                    }
                    P1--;
                    P2++;
                }

        }
        for(int i=start;i<=(start+end-1);i++)
        {
            System.out.print(a.charAt(i));
        }
    }
    public static boolean isPallidrome(String A)
    {
        String res = "";
        for(int i=A.length()-1;i>=0;i--)
        {
            res+=A.charAt(i);
        }
        for(int i=0;i<A.length();i++)
        {
            if(res.charAt(i)!=A.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
