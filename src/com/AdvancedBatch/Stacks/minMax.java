package com.AdvancedBatch.Stacks;

import java.util.Collections;

public class minMax {
    public static void main(String[] args) {
        int[] A = {4,7,3,8};
        int sum=getSubarrays(A);
        System.out.println(sum);
    }
    public static int getSubarrays(int[] A)
    {
        int masterSum=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=0;
                if((j-i+1)==1)
                {
                    sum=0;
                }
                else
                {
                    int min=Integer.MAX_VALUE;
                    int max=Integer.MIN_VALUE;
                    for(int k=i;k<=j;k++)
                    {
                        min=Math.min(A[k],min);
                        max=Math.max(A[k],max);
                    }
                    sum=max-min;
                }
                masterSum+=sum;
            }
        }
        return masterSum%(1000000000+7);
    }

}
