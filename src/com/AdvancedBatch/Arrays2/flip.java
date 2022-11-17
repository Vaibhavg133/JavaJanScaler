package com.AdvancedBatch.Arrays2;

public class flip {
    public static void main(String[] args) {
        String A = "010";
        solve(A);
    }
    public static void solve(String A)
    {
        StringBuilder string = new StringBuilder(A);
        int max = Integer.MIN_VALUE;
        int a=-1,b=-1;
        int[] result = new int[2];
        for(int i=0;i<A.length();i++)
        {
            for(int j=i;j<A.length();j++)
            {
                a = i;
                b = j;
                if(A.charAt(a)=='0')
                {
                    string.setCharAt(a,'1');
                }
                else if(A.charAt(a)=='1')
                {
                    string.setCharAt(a,'0');
                }
                if(A.charAt(b)=='0')
                {
                    string.setCharAt(b,'1');
                }
                else if(A.charAt(b)=='1')
                {
                    string.setCharAt(b,'0');
                }
                int countOne = count(A);
                max=countOne;

            }
        }
        System.out.println(max+" "+a+" "+b);
    }
    public static int count(String A)
    {
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }


}
