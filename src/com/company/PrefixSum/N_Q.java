package com.company.PrefixSum;

import java.util.Scanner;

public class N_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int[] PS = new int[A.length];
        PS[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            PS[i]=PS[i-1]+A[i];
        }
        int Q = 4;
        for(int i=0;i<Q;i++)
        {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int sum=0;
            if(s==0)
            {
                sum=PS[e];
            }
            else
            {
                sum=PS[e]-PS[s-1];
            }
            System.out.println(sum);
        }

    }
}
