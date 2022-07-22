package com.company.Feb;

public class ag {
    public static void main(String[] args) {
        String s = "bcaggag";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                for(int j=i;j<s.length();j++)
                {
                    if(s.charAt(j)=='g')
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
