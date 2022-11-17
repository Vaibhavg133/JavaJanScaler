package com.AdvancedBatch.BinarySearch;

import java.util.Arrays;

public class findElementInUnsortedArray {
    public static void main(String[] args) {
        int[] A = { 2,8,3,11,14};
        int[] B = { 2,8,3,11,12};
        int K = 2;
        int res = bruteForce(A,K);
        System.out.println(res);
        int res2 = optimized(A,K);
        System.out.println(res2);
    }
    public static int bruteForce(int[] A, int K)
    {
        Arrays.sort(A);
        return A[K];
    }
    public static int optimized(int[] A, int K)
    {
        int s = min(A);
        int e = max(A);
        int ans=-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            int count = countLess(A, K);
            if(count<K)
            {
                s=mid+1;
            }
            else if(count==K)
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    public static int countLess(int[] A, int K)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<K)
            {
                count++;
            }
        }
        return count;
    }

    public static int max(int[] A)
    {
        int res = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>res)
            {
                res=A[i];
            }
        }
        return res;
    }
    public static int min(int[] A)
    {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<res)
            {
                res=A[i];
            }
        }
        return res;
    }


}
