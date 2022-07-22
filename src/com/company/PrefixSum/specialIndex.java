package com.company.PrefixSum;

import java.util.Scanner;

public class specialIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {4,3,2,7,6,-2};
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
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            int sume=0;
            int sumo=0;
            if(i==0)
            {
                sumo=PSeven[A.length-1]-PSeven[i];
                sume=PSodd[A.length-1]-PSodd[i];
            }
            else if(i==A.length-1)
            {
                sumo=PSodd[i-1];
                sume=PSeven[i-1];
            }
            else
            {
                sumo=PSodd[i-1]+ (PSeven[A.length-1]-PSeven[i]);
                sume=PSeven[i-1]+(PSodd[A.length-1]-PSodd[i]);
            }
            if(sume==sumo)
            {
                System.out.println(i);
            }
        }
    }
}
