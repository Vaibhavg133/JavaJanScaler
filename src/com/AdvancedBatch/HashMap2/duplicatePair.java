package com.AdvancedBatch.HashMap2;

public class duplicatePair {
    public static void main(String[] args) {
        int[] A = {1,3,4,1,5,1,4};
        System.out.println(bruteForce(A));
    }
    public static int bruteForce(int[] A)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]==A[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
