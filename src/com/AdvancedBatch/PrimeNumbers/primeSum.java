package com.AdvancedBatch.PrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class primeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2;i<number;i++)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }
        }
        for(int i=0;i<primes.size();i++)
        {
            for(int j=0;j<primes.size();j++)
            {
                if(primes.get(i)+primes.get(j)==number)
                {
                    System.out.println(primes.get(i)+"+"+primes.get(j));
                }
            }
        }
    }
    public static boolean isPrime(int A)
    {
        for(int i=2;i*i<=A;i++)
        {
            if(A%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
