package com.AdvancedBatch.Sorting;

import java.util.Arrays;

public class kthSmallest {
    public static void main(String[] args) {
        int[] A = {2,1,4,3,2}; //1,2,2,3,4
        int solve=solve(A,3);
        System.out.println(solve);

    }
    public static int solve(int[] A,int C)
    {
        Arrays.sort(A);
        return A[C-1];
    }

}
