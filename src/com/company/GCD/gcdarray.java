package com.company.GCD;

public class gcdarray {
    public static void main(String[] args) {
        int[] A = {10,20,30,42,64};
        int g = A[0];
        for(int i=1;i<A.length;i++)
        {
            g=gcd(A[i],g);
        }
        System.out.println(g);
    }
    public static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }

}
