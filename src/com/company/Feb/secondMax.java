package com.company.Feb;

import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        int[] A = {2,1,2};
        int largest = Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>largest)
            {
                idx=i;
                largest=A[i];
            }
        }
        int slar = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(i!=idx)
            {
                if(A[i]>slar)
                {
                    slar=A[i];
                }
            }
        }
        System.out.println(slar);
    }
}
