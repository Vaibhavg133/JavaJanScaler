package com.company.Jan;
import java.lang.String;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String sample = sc.next();
        StringBuilder sb = new StringBuilder(sample);
        for(int i=sample.length()-1;i>=0;i--)
        {
            sb.append(i);
        }
        System.out.println(sb);
//        if(pallindrome(sample))
//        {
//            System.out.println(0);
//        }
//        else
//        {
//            int r=changeInRevs(sample);
//            System.out.println(r);
//        }
    }
    public static String reverse(String A)
    {
        String temp = "";
        StringBuilder sb = new StringBuilder(A);

        for(int i=A.length()-1;i>=0;i--)
        {
            sb.append(i);
            temp+=A.charAt(i);
        }
        return temp;
    }
    public static boolean pallindrome(String A)
    {
        String revString=reverse(A);
        if(revString==A)
        {
            return true;
        }
        return false;
    }
    public static int changeInRevs(String A)
    {
        String revString = reverse(A);
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(revString.charAt(i)!=A.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
    public static String trim(String str)
    {
        int end=str.length();
        int i=0;
        while(i<end && str.charAt(i)=='*')
        {
            i++;
        }
        while(end>i && str.charAt(end-1)=='*')
        {
            end--;
        }
        if(i<end)
        {
            String temp = "";
            for(int j=i;j<end;j++)
            {
                temp+=str.charAt(j);
            }
//            return str.substring(i,end);
            return temp;
        }
        else
        {
            return " ";
        }

    }

}
