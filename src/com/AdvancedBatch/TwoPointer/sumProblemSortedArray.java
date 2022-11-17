package com.AdvancedBatch.TwoPointer;

public class sumProblemSortedArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int K = 5;
        printPairs(A,K);
        int[] A1 = {-3,0,1,3,8,11,14,18,25};
        int K1 = 5;
        //printPairsNew(A1,K1);
    }
    public static void printPairsNew(int[] A,int K)
    {
        int i=0;
        int j=A.length-1;
        while(i<j)
        {
            int diff = A[i]-A[j];
            if(diff<K)
            {
                i++;
            }
            else if(diff>K)
            {
                j--;
            }
            else
            {
                System.out.print(A[i]+" "+A[j]);
                System.out.println();
                i++;
                j--;
            }
        }
    }

    public static void printPairs(int[] A,int K)
    {
        int i=0;
        int count=0;
        int j=A.length-1;
        for(int a=0;a<A.length;a++)
        {
            if(A[a]==K)
            {
                count++;
            }
        }
        while(i<=j)
        {
            int sum=A[i]+A[j];
            if(sum<K)
            {
                i++;
            }
            else if(sum>K)
            {
                j--;
            }
            else
            {
                count++;
                System.out.print(A[i]+" "+A[j]);
                System.out.println();
                i++;j--;
            }

        }
        System.out.println(count);
    }

}
