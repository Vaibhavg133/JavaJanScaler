package com.AdvancedBatch.PrimeNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class countDIv {
    public static void main(String[] args) {
        int[] array = {2,3,4,5};
        //
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<array.length;i++)
        {
            if(isPrime(array[i]))
            {
                res.add(2);
            }
            else
            {
                res.add(countFact(array[i])+2);
            }
        }
        for(int i : array)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : res)
        {
            System.out.print(i+" ");
        }
    }
    public static int countFact(int A)
    {
        int count=0;
        for(int i=2;i<A;i++)
        {
            if(A%i==0)
            {
                count++;
            }
        }
        return count;
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
