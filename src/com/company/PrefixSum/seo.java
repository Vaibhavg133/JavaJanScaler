package com.company.PrefixSum;

import java.util.Scanner;

public class seo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {2,3,1,-1,0,8,5,4};
        int Q = 2;
        int[] PSodd = new int[A.length];
        PSodd[0]=0;
        for(int i=1;i<A.length;i++)
        {
            if(i%2!=0)
            {
                PSodd[i]=PSodd[i-1]+A[i];
            }
            else
            {
                PSodd[i]=PSodd[i-1];
            }
        }
        System.out.println("PSOdd Data");
        for (int i=0;i<PSodd.length;i++)
        {
            System.out.print(PSodd[i]+" ");
        }
        System.out.println();
        int[] PSeven = new int[A.length];
        PSeven[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(i%2==0)
            {
                PSeven[i]=PSeven[i-1]+A[i];
            }
            else
            {
                PSeven[i]=PSeven[i-1];
            }
        }
        System.out.println("PSeven Data");
        for(int i=0;i<PSeven.length;i++)
        {
            System.out.print(PSeven[i]+" ");
        }
        System.out.println();
        for(int i=0;i<Q;i++)
        {
            int sum=0;
            int s = sc.nextInt();
            int e = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c=='O')
            {
                sum=PSodd[e]-PSodd[s-1];
            }
            else if(c=='E')
            {
                sum=PSeven[e]-PSeven[s-1];
            }
            System.out.println(sum);
        }
    }
}
