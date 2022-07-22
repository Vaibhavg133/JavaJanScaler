package com.company.PrefixSum;

import java.util.Scanner;

public class equilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] A = {-7,1,5,2,-4,3,0};
        int[] A = {1,2,3,4,8,10};
        int[] PS = new int[A.length];
        PS[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            PS[i]=PS[i-1]+A[i];
        }
        for(int i=0;i<PS.length;i++)
        {
            System.out.print(PS[i]+" ");
        }
        System.out.println();
        for(int i=0;i<A.length;i++)
        {
            int suml=-1;
            int sumr=-1;
            if(i==0)
            {
                suml=0;
                sumr=PS[A.length-1]-PS[i];
            }
            else if(i==A.length-1)
            {
                suml=PS[i-1];
                sumr=0;
            }
            else
            {
                suml=PS[i-1];
                sumr=PS[A.length-1]-PS[i];
            }
            if(suml==sumr)
            {
                System.out.println(i);
            }
        }
    }
}
