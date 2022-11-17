package com.AdvancedBatch.Sorting;

import java.util.ArrayList;

public class merge {
    public static void main(String[] args) {
        int[] A = {4,7,9};
        int[] B = {2,11,19};
        ArrayList<Integer> result = sort(A,B);
        System.out.println();
        for(int i : result)
        {
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> sort(int[] A, int[] B)
    {
        int[] array = new int[A.length+B.length];
        for(int i=0;i<array.length;i++)
        {
            array[i]=0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : A)
        {
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        for(int i : B)
        {
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        int[] freq = new int[max+1];
        for(int i=0;i< freq.length;i++)
        {
            freq[i]=0;
        }
        for(int i=0;i<A.length;i++)
        {
            freq[A[i]]++;
        }
        for(int i=0;i<B.length;i++)
        {
            freq[B[i]]++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i< freq.length;i++)
        {
            if(freq[i]!=0)
            {
                while(freq[i]!=0)
                {
                    //number is index and freq is value
                    result.add(i+1);
                    freq[i]--;
                }
            }
        }

        return result;
    }

}
