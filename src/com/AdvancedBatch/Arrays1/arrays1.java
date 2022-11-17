package com.AdvancedBatch.Arrays1;

public class arrays1 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,-10};
        System.out.println(KadensAlgo(A));
    }
    public static int KadensAlgo(int[] A)
    {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<A.length;i++)
        {
            currentSum+=A[i];
            if(max<currentSum)
            {
                max=currentSum;
            }
            if(currentSum<0)
            {
                currentSum=0;
            }
        }
        return max;
    }
}
