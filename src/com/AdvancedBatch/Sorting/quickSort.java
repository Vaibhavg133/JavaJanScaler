package com.AdvancedBatch.Sorting;
import com.AdvancedBatch.Sorting.mergeSort;
public class quickSort {
    public static void main(String[] args) {
        int[] A = {7,9,0,5,5,8,1,6,0,1};
        mergeSort.printList(A);
        quickSort(A,0,A.length-1);
        System.out.println();
        mergeSort.printList(A);
    }

    public static void quickSort(int[] A, int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        int p = partition(A,start,end);
        quickSort(A,start,p-1);
        quickSort(A,p+1,end);
    }
    public static int partition(int[] A, int start, int end)
    {
        int pivot = A[end];
        int i=start-1;
        for(int j=start;j<end;j++)
        {
            if(A[j]<=pivot)
            {
                i++;
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        int temp = A[end];
        A[end]=A[i+1];
        A[i+1]=temp;
        return i+1;
    }
}
