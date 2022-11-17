package com.AdvancedBatch.BinarySearch;

public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] A= {1,3,5,6};
        System.out.println(binarySearch(A,5));
    }
    public static int binarySearch(int[] A, int target)
    {
        int start = 0;
        int end = A.length-1;
        while(start!=end)
        {
            int mid = (end+start)/2;
            if(A[mid]==target)
            {
                return mid+1;
            }
            else if(A[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }

        return -1;
    }

}
