package com.AdvancedBatch.Arrays2;

public class equilibriumIndex {
    public static void main(String[] args) {
        int[] A = {-7,1,5,2,-4,3,0};
        bruteForce(A);
    }
    public static int bruteForce(int[] A)
    {
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                PS[i]=A[i];
            }
            else
            {
                PS[i]=PS[i-1]+A[i];
            }
        }
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            int sumL=0;int sumR=0;
            if(i==0)
            {
                sumL=0;
                sumR = PS[A.length-1]-PS[i];
            }
            else if(i==A.length-1)
            {
                sumL = PS[i-1];
                sumR = 0;
            }
            else
            {
                sumL = PS[i-1];
                sumR = PS[A.length-1]-PS[i];

            }
            if(sumL==sumR)
            {
                return i;
            }
        }
        return -1;

    }

}
