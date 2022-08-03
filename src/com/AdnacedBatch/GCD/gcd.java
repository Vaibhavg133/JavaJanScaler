package com.AdnacedBatch.GCD;

public class gcd {
    public static void main(String[] args) {
        int[] A = {24,16,18,30,15};
        int gcd = A[0];
        System.out.print(gcd+" ");
        for(int i=1;i<A.length;i++)
        {
            gcd=getGCD(gcd,A[i]);
            System.out.print(gcd+" ");
        }

        System.out.println();

        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                PS[i]=A[i];
            }
            else
            {
                PS[i]=getGCD(PS[i-1],A[i]);
            }
        }
        for(int i=0;i<PS.length;i++)
        {
            System.out.print(PS[i]+" ");
        }

        int[] SuffixGCD = new int[A.length];
        for(int j=A.length-1;j>=0;j--)
        {
            if(j==A.length-1)
            {
                SuffixGCD[j]=A[j];
            }
            else
            {
                SuffixGCD[j]=getGCD(SuffixGCD[j+1],A[j] );
            }
        }
        System.out.println();
        for(int j=0;j<SuffixGCD.length;j++)
        {
            System.out.print(SuffixGCD[j]+" ");
        }
    }
    public static int getGCD(int A, int B)
    {
        if(A==0)
        {
            return B;
        }
        return getGCD(B%A,A);
    }

}
