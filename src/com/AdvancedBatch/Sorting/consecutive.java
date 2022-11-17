package com.AdvancedBatch.Sorting;

import java.util.Arrays;

public class consecutive {
    public static void main(String[] args) {
        int[] A = {3,2,1,4,5};
        int solve = solve(A);
        System.out.println(solve);
    }
    public static int solve(int[] A)
    {
        //int res = 1;
        Arrays.sort(A);
        for(int i=A.length-1;i>0;i--)
        {
            int diff = A[i]-A[i-1];
            if(diff==-1)
            {
                diff=diff*-1;
            }
            if(diff!=1)
            {
                return 0;
            }
        }
        return 1;
    }

}
