package com.company.Recursion;

public class aPowN {
    public static void main(String[] args) {
        int pp = power(10,3);
        System.out.println(pp);
    }
    public static int power(int a, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return a*power(a,n-1);
    }

}
