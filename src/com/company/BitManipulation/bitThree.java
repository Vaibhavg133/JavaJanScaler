package com.company.BitManipulation;

public class bitThree {
    public static void main(String[] args) {
        System.out.println("get ith bit "+getithBit(13,1));
        System.out.println("set ith bit "+setithBit(13,4));
        System.out.println("toggle ith bit "+toggleBit(13,0));
        System.out.println("clear the last ith bit "+clearLastithBits(13,2));
    }
    public static int getithBit(int N,int i)
    {
        return (N>>i)&1;
    }
    public static int setithBit(int N, int i)
    {
        N=N|(1<<i);
        return N;
    }
    public static int toggleBit(int N,int i)
    {
        int mask=1<<i;
        return N^mask;
    }
    public static int clearLastithBits(int N,int i)
    {
        return (N>>i)<<i;
    }



}
