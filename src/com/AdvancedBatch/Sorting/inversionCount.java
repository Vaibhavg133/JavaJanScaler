package com.AdvancedBatch.Sorting;

public class inversionCount {
    public static void main(String[] args) {
        int[] A = {3,2,1};
        System.out.println(solve(A));
    }
    public static int solve(int[] A)
    {
        int res = 0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    res++;
                }
            }
        }
        return res;
    }

}
