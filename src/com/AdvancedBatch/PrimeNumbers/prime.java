package com.AdvancedBatch.PrimeNumbers;

public class prime {
    public static void main(String[] args) {
        int N = 54;
        primeFactorization(N);
    }
    public static void primeFactorization(int A)
    {
        for(int i=2;i<=A;i++)
        {
            if(A%i==0)
            {
                int cnt=0;
                while(A%i==0)
                {
                    cnt++;
                    A=A/i;
                }
                System.out.print(i+"^"+cnt+" ");
            }
        }
    }

}
