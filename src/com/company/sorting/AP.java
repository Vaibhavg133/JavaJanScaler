package com.company.sorting;

import java.util.Arrays;

public class AP {
    public static void main(String[] args) {
        int[] A = {3,5,1};
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++)
        {
            int res = A[i]-A[i+1];
            System.out.print(res+" ");
        }

    }
}
