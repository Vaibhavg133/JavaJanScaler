package com.AdvancedBatch.Sorting;

public class ElementRemoval {
    public static void main(String[] args) {
        int[] A = {1};//{2,1};//{1,2,3};
        int min = Integer.MAX_VALUE;
        int cost=0;
        for(int i=0;i<A.length;i++)
        {
            cost += A[i];
            int sum=0;
            for(int j=i+1;j<A.length;j++)
            {
                sum+=A[j];
            }
            cost+=sum;
            //System.out.println("cost "+cost);
            //min=Math.min(min,cost);
        }
        System.out.println(cost);
    }
}
