package com.AdvancedBatch.Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int[] A = {1,2,1,3,4,3};
        int B = 3;
        ArrayList<Integer> result = test(A,B);
        for(int i : result)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> test(int[] A, int B)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(B>A.length)
        {
            return result;
        }
        for(int i=0;i<A.length-B+1;i++)
        {
            int start=0;
            start=i;
            int[] res = new int[B];
            for(int j=0;j<res.length;j++)
            {
                res[j]=A[start];
                start++;
            }
            HashSet<Integer> ress = new HashSet<>();
            for(int a : res)
            {
                ress.add(a);
            }
            result.add(ress.size());
        }
        return result;
    }

}
