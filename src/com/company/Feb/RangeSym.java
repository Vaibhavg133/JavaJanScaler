package com.company.Feb;

import java.util.Scanner;

public class RangeSym {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] A = {7,3,1,5,5,5,1,2,4,5};
        int[][] B = {{7,10},{3,10},{3,5},{1,10}};
        int[] PS = new int[A.length];
        PS[0]=A[0];
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=1;i<A.length;i++)
        {
            PS[i]=PS[i-1]+A[i];
        }
        for(int i=0;i<PS.length;i++)
        {
            System.out.print(PS[i]+" ");
        }
        System.out.println();
        for(int i=0;i<B.length;i++)
        {
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            int sum=0;
            if(start==0)
            {
                sum=PS[end];
            }
            else {
                sum = PS[end] - PS[start - 1];
            }

        }
    }
}
