package com.AdvancedBatch.Strings;

public class PrefixString {
    public static void main(String[] args) {
        String A = "abababab";//"aabaaba";//"abcab";//"abababab";
        //String[] PS = prefixString(A);
        //System.out.println(solve(A));
        //System.out.println(LPSofString(A));
        int[] LPS = LPSArray(A);
        for(int i:LPS)
        {
            System.out.print(i+" ");
        }
    }
    public static int[] LPSArray(String A)
    {
        String[] PS = prefixString(A);
        int[] LPSArray = new int[A.length()];
        for(int i=0;i<PS.length;i++)
        {
            LPSArray[i]=LPSofString(PS[i]).length();
        }
        return LPSArray;
    }

    public static String LPSofString(String A)
    {
        String[] PS = prefixString(A);
        String[] SS = suffixString(A);
        int i=0;
        int j=SS.length-1;
        String master="";
        while(i<PS.length-1 && j>0)
        {
            if(PS[i].equals(SS[j]))
            {
                master=PS[i];
            }
            i++;
            j--;
        }
        return master;
    }

    public static int solve(String A)
    {
        String[] PS = prefixString(A);
        String[] SS = suffixString(A);

        int count=0;
        int i=0;
        int j=SS.length-1;
        int counter=0;
        while(i<PS.length && j>=0)
        {
            if(PS[i].equals(SS[j]))
            {
                break;
            }
            counter++;
            i++;j--;
        }
        return counter+1;
    }

    public static String[] suffixString(String A)
    {
        String[] SS = new String[A.length()];
        for(int i=A.length()-1;i>=0;i--)
        {
            if(i==A.length()-1)
            {
                SS[i]=""+A.charAt(i);
            }
            else
            {
                SS[i]=""+A.charAt(i)+SS[i+1];
            }
        }
        return SS;
    }

    public static String[] prefixString(String A)
    {
        String[] PS = new String[A.length()];

        for(int i=0;i<A.length();i++)
        {
            if(i==0)
            {
                PS[i]=""+A.charAt(i);
            }
            else
            {
                PS[i]=""+PS[i-1]+A.charAt(i);
            }
        }
        return PS;
    }

}
