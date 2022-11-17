package com.AdvancedBatch.Sorting;

public class SumTheDifference {
    public static void main(String[] args) {
        int[] A = {5,4,2};
        System.out.println(solve(A));

    }
    public static int solve(int[] A)
    {
        int master=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int k=i;k<=j;k++)
                {
                    max=Math.max(A[k],max);
                    min=Math.min(A[k],min);
                }
                int res = max-min;
                master+=res;
            }
        }
        return master;
    }

}
