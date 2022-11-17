package com.AdvancedBatch.Arrays2;

public class pickFromBothSide {
    public static void main(String[] args) {
        int[] A = {1,2};//{5,-2,3,1,2};
        int B = 1;
        System.out.println(bruteForce(A,B));
    }
    public static int bruteForce(int[] A,int B)
    {
        int max = Integer.MIN_VALUE;
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                PS[i]=A[i];
            }
            else
            {
                PS[i]=PS[i-1]+A[i];
            }
        }
        int[] PSrev = new int[A.length];
        for(int i = PSrev.length-1; i >= 0 ;i--)
        {
            if(i==A.length-1)
            {
                PSrev[i]=A[i];
            }
            else
            {
                PSrev[i]=PSrev[i+1]+A[i];
            }
        }
        int sum = PS[B];
        max=Math.max(sum,max);
        int j = B-2;
        int k = A.length-1;
        while(B!=0)
        {
            if(j>=0)
            {
                sum=PS[j]+PSrev[k];
            }
            else if(j<0 && k>=0)
            {
                sum=PS[k];
            }
            max=Math.max(sum,max);
            j--;k--;B--;
        }
        return max;
    }


}
