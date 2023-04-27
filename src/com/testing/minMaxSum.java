package com.testing;

public class minMaxSum {
    public static void main(String[] args) {
        int[] A = {1,2};
        System.out.println(solve(A));

    }
    public static int solve(int[] A)
    {
        int master=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int k=i;k<=j;k++)
                {
                    min=Math.min(min,A[k]);
                    max=Math.max(max,A[k]);
//                    System.out.print(A[k]+" ");
                }
                int res = max-min;
                master+=res;
//                System.out.println();
            }
        }
        return master;
    }

}
