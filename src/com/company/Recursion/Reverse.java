package com.company.Recursion;

public class Reverse {
    public static void main(String[] args) {
        String rev = "hello";
        reverse(rev,rev.length());
        //System.out.println(str);

    }
    public static void reverse(String rev,int len)
    {
        int l = rev.length();
        if(l==0)
        {
            return;
        }
        System.out.print(""+rev.charAt(l-1));
        reverse(rev,l-1);
    }

}
