package com.company.BitManipulation;

public class Reverse {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
        int b=a<<32;
        System.out.println(b);
        int c = Integer.MAX_VALUE;
        int d = Integer.MIN_VALUE;
        System.out.println(c);
        System.out.println(d);
        System.out.println(1<<30);
        System.out.println(13|(1<<4));//bin
        System.out.println(13-(1<<3));
        System.out.println(checkithBit(4,2));
        int N = toggleAllRightBit(4,2);
        System.out.println(N);
    }
    public static boolean checkithBit(int N, int i)
    {
        if(((N>>i)&1)==1) {
            return true;
        }
        return false;
    }
    public static int toggleAllRightBit(int N, int i)
    {
        N=N^(1<<i);
        while(i!=0)
        {
            N=N|(1<<i-1);
            i=i-1;
        }
        return N;
    }


}
