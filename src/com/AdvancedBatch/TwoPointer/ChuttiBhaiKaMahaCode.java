package com.AdvancedBatch.TwoPointer;

import java.util.Arrays;

public class ChuttiBhaiKaMahaCode {
    public static void main(String[] args) {
        int[] A = {1,5,3,4,2,0};//{8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
        int B = 5;
        Arrays.sort(A);
        System.out.println(BinaySearch(A,B));
        System.out.println(solve(A,B));

    }
    public static int solve(int[] A, int B)
    {
        Arrays.sort(A);
        int count=0;
        for(int i=0;i<A.length;i++)
        {   int c = B-A[i];
            if(BinaySearch(A,c))
            {
                count++;
            }
        }
        return count;

    }
    public static boolean BinaySearch(int [] arr, int x)
    {
        int l = 0, r = arr.length - 1;
        boolean abc=true;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return true;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return false;
    }


}
