package com.AdvancedBatch.BinarySearch;

public class specialInteger {
    public static void main(String[] args) {
        int[] A = {5,17,100,11};
        int B = 130;
        System.out.println(myFuncBruteForce(A,B));
    }
    public static int BinarySearch(int[] A,int B)
    {
        int result=0;
        int end=A.length-1;
        int start=0;
        return result;
    }

    public static int myFuncBruteForce(int[] A, int B)
    {
        int result = 0;
        int size = A.length;
        for(int K=0;K<size;K++)
        {
            int i=0;
            int j=K;
            int inc=0;
            int checkSize=size-j;
            while(i<size || j<size)
            {
                int sum=0;
                for(int a=i;a<=j && j<size;a++)
                {
                    sum+=A[a];
                }
                if(sum>B)
                {
                    break;
                }
                else
                {
                    inc++;
                }
                i++;
                j++;
            }
            if(inc==checkSize)
            {
                result++;
            }
            else
            {
                break;
            }
        }
        return result;
    }

}
