package com.company.Feb;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='g')
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

        int count_a=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                count_a++;
            }
            else if(s.charAt(i)=='g')
            {
                ans+=count_a;
            }
        }
        System.out.println(ans);
    }
}
