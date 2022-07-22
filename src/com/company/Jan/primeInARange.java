package com.company.Jan;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class primeInARange {
    public static boolean[] seiveOfEratoSthenes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            for (int j = 2 * i; j <= N; j = j + i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void gcdFind()
    {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B=sc.nextInt();
        int divisor,dividend;
        if(A>B)
        {
            dividend=A;
            divisor=B;
        }
        else
        {
            dividend=B;
            divisor=A;
        }
        while(divisor!=0)
        {
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(dividend);
    }


    public static void main(String[] args) {
        //gcdFind();
        //print(5);
        //Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
//        boolean isPrime[] = seiveOfEratoSthenes(N);
//        for(int i=0;i<=N;i++)
//        {
//            if(isPrime[i])
//            {
//                System.out.print(i+" ");
//            }
//        }
    }

}
