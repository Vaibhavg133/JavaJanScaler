package com.company.ArrayProblem;

public class triplets {
    public static void main(String[] args) {
        //int[] A = {3,4,6,9,2};
        int[] A = {2,6,9,4,10};
        int count = bruteForce(A);
        System.out.println(count);
        int ans = optimized(A);
        System.out.println(ans);
    }
    public static int optimized(int[] A)
    {
        int ans=0;
        for(int i=1;i<A.length-1;i++)
        {
            int leftSmallCount=0;
            for(int j=0;j<i;j++)
            {
                if(A[i]>=A[j])
                {
                    leftSmallCount++;
                }
            }
            int rightSmallCount = 0;
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>=A[j])
                {
                    rightSmallCount++;
                }
            }
            ans+=(leftSmallCount*rightSmallCount);
        }
        return ans;
    }

    public static int bruteForce(int[] A)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                for(int k=j+1;k<A.length;k++)
                {
                    if(A[k]>=A[j] && A[j]>=A[i])
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
