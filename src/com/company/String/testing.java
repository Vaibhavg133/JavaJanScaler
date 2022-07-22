package com.company.String;

import java.util.Arrays;

public class testing {
    public static void main(String[] args) {
        char[] ch = {'b','a','t','m','a','n'};
        char[] ch1 = {'S','n','a','k','e'};
//        System.out.println(ch1);
//        char[] abc=reverse(ch1,1,3);
//        System.out.println(abc);
        char[] abc = {'a','a','a','a','b','a','a','a'};
        System.out.println(iisPallindrome(abc,3,4));
    }
    public static boolean iisPallindrome(char[] c, int s, int e)
    {
        //boolean flag=true;
        char[] cc = new char[c.length];
        for(int i=0;i<c.length;i++)
        {
            cc[i]=c[i];
        }
        int P1=s,P2=e;
        while(P1<P2)
        {
            char a = cc[P1];
            cc[P1]=cc[P2];
            cc[P2]=a;
            P1++;
            P2--;
        }
        for(int i=0;i<cc.length;i++)
        {
            if(cc[i]!=c[i])
            {
                return false;
            }
        }
        return true;
    }
    public static char[] reverse(char[] c, int s, int e)
    {
        int P1=s;
        int P2=e;
        while(P1<P2)
        {
            char cc = c[P1];
            c[P1]=c[P2];
            c[P2]=cc;
            P1++;
            P2--;
        }
        return c;
    }

    public static void countingSort(char[] ch)
    {
        int[] freq = new int[26];
        for(int i=0;i< freq.length;i++)
        {
            freq[i]=0;
        }
        for(int i=0;i<ch.length;i++)
        {
            freq[ch[i]-97]+=1;
        }
        for(int i=0;i< freq.length;i++)
        {
            while(freq[i]!=0)
            {
                System.out.print((char)(i+'a'));
                freq[i]--;
            }
        }
    }

}
