package com.company.interview;

public class mentorFirst {
    public static void main(String[] args) {
        int[] A = {1,0,1,1,1,0,1,0,0,0,1};
        twoPointerSort(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void twoPointerSort(int[] A)
    {
        int start=0;
        int end=A.length-1;
        while(start<=end)
        {
            if(A[start]>A[end])
            {
                int temp = A[start];
                A[start]=A[end];
                A[end]=temp;
                start++;
                end--;
            }
            else if(A[start]<A[end])
            {
                start++;
                end--;
            }
            else if(A[start]==1)
            {
                start++;
            }
            else if(A[start]==0)
            {
                end--;
            }
        }
    }
}
