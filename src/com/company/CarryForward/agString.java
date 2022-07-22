package com.company.CarryForward;

public class agString {
    public static void main(String[] args) {
        String s = "acgdgag";
        int count = bruteForce(s);
        System.out.println(count);
        int count2 = optimized(s);
        System.out.println(count2);
    }
    public static int optimized(String s)
    {
        int ans=0;
        int count_a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                count_a++;
            }
            else if(s.charAt(i)=='g')
            {
                ans=ans+count_a;
            }
        }
        return ans;
    }

    public static int bruteForce(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='g')
                    {
                        //System.out.println(i+" "+j);
                        count++;
                    }
                }
            }
        }
        //System.out.println(count);
        return count;
    }
}
