package com.AdvancedBatch.Sorting;

public class mergeSort {
    public static void main(String[] args) {
        int[] A = {7,9,0,5,5,8,1,6,0,1};
        printList(A);
        System.out.println();
        MergeSort(A,0,A.length-1);
        printList(A);
    }
    public static void printList(int[] A)
    {
        for(int x: A)
        {
            System.out.print(x+" ");
        }
    }
    public static void MergeSort(int[] A, int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid = (s+e)/2;
        MergeSort(A,s,mid);
        MergeSort(A,mid+1,e);
        merge(A,s,mid,e);
    }
    public static void merge(int[] A, int s, int mid, int e)
    {
        int sizeA = mid-s+1;
        int sizeB = e-mid;

        int[] LeftSide  = new int[sizeA];
        int[] RightSide = new int[sizeB];
        for(int i=0;i<sizeA;i++)
        {
            LeftSide[i]=A[s+i];
        }
        for(int i=0;i<sizeB;i++)
        {
            RightSide[i]=A[mid+i+1];
        }
        int i=0,j=0;
        int K = s;
        while(i<LeftSide.length && j<RightSide.length)
        {
            if(LeftSide[i]<=RightSide[j])
            {
                A[K]=LeftSide[i];
                i++;
            }
            else
            {
                A[K]=RightSide[j];
                j++;
            }
            K++;
        }
        while(i<LeftSide.length)
        {
            A[K]=LeftSide[i];
            i++;
            K++;
        }
        while(j<RightSide.length)
        {
            A[K]=RightSide[j];
            j++;
            K++;
        }
    }


}
