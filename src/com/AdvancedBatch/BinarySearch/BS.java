package com.AdvancedBatch.BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = {1,1,3,3,3,3,5,6,8,10,12};
        int res = BinarySearch(A,5);
        int res2 = lastOccurence(B,3);
        System.out.println(res2);
    }
    public static int firstOccurence(int[] A, int T)
    {
        int s = 0;
        int e = A.length-1;
        int ans = -1;
        while(s!=e) {
            int mid = (s + e) / 2;
            if (A[mid] == T) {
                ans = mid;
                e = mid - 1;
            } else if (A[mid] > T) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int[] A, int T)
    {
        int s = 0;
        int e = A.length-1;
        int ans = -1;
        while(s!=e) {
            int mid = (s + e) / 2;
            if (A[mid] == T) {
                ans = mid;
                s = mid + 1;
            } else if (A[mid] > T) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }


    public static int BinarySearch(int[] A, int T)
    {
        int s = 0;
        int e = A.length-1;
        while(s!=e)
        {
            int mid=(s+e)/2;
            if(A[mid]==T)
            {
                return mid+1;
            }
            else if(A[mid]>T)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return -1;
    }

}
