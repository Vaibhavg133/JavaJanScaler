package com.codingProblems.leetCode;

public class P_704_binarySearch {
    public static void main(String[] args) {
        int[]A = {-1,0,3,5,9,12};
        System.out.println(binarySearch(A,9));
    }
    public static int binarySearch(int[] A, int target)
    {
        int start=0,end=A.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(A[mid]==target)
            {
                return mid;
            }
            else if(A[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
