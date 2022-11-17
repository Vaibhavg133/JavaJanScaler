package com.AdvancedBatch.PrimeNumbers;

import java.util.ArrayList;

public class primeSubsequence {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        ArrayList<Integer> primeCollector = new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            if(isPrime(array[i]))
            {
                primeCollector.add(array[i]);
            }
        }

        ArrayList<Integer> list = arrayToList(array);

    }
    public static ArrayList<Integer> arrayToList(int[] A)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            list.add(A[i]);
        }
        return list;
    }

    public static boolean isPrime(int A)
    {
        if(A==1)
        {
            return false;
        }
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
