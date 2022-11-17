package com.AdvancedBatch.PrimeNumbers;

import java.util.Scanner;

public class seiveOfEratothenis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        boolean[] seive = seiveOfErato(A);

        int solve = solve(A);
    }
    public static boolean[] seiveOfErato(int A)
    {
        boolean[] isPrime = new boolean[A+1];
        for(int i=0;i<isPrime.length;i++)
        {
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<=A;i++)
        {
            for(int j=2*i;j<=A;j+=i)
            {
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
    public static int solve(int A)
    {
        int result = 0;
        boolean[] seive = seiveOfErato(A);
        int[] seive2 = new int[seive.length];
        for(int i=0;i<seive2.length;i++)
        {
            seive2[i]=0;
        }
        for(int i=0;i<= seive.length;i++)
        {
            if(seive[i]==true)
            {
                for(int j=2*i;j<=A;j+=i)
                {
                    seive2[j]=seive2[j]++;
                }
            }
        }
        System.out.println();
        for(int i : seive2)
        {
            System.out.println(i);
        }
        return result;
    }


}
