package com.company.sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] A ={4,6,8,21,3,1,3,2,1};
        bubbleSort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void bubbleSort(int[] A)
    {
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=0;j<A.length-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }

}
