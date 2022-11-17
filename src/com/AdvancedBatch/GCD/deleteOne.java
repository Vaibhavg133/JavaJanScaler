package com.AdvancedBatch.GCD;

public class deleteOne {
    public static void main(String[] args) {
        int[] Array = {12,15,18};
        System.out.println(solve(Array));

    }
    public static int solve(int[] A)
    {
        int result = 0;
        int[] prefix = new int[A.length];
        int[] suffix = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                prefix[i]=A[i];
            }
            else
            {
                prefix[i]=gcd(prefix[i-1],A[i]);
            }
        }
        for(int i=A.length-1;i>=0;i--)
        {
            if(i==A.length-1)
            {
                suffix[i]=A[i];
            }
            else
            {
                suffix[i]=gcd(A[i],suffix[i+1]);
            }
        }
        int ans=1;
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                ans = Math.max(ans,suffix[i+1]);
            }
            else if(i==A.length-1)
            {
                ans = Math.max(ans,prefix[i-1]);
            }
            else
            {
                ans = Math.max(ans,gcd(prefix[i-1],suffix[i+1] ));
            }
        }
        return ans;
    }
    public static int gcd(int A, int B)
    {
        int min = Math.min(A,B);
        int gcd = 1;
        for(int i=1;i<=min;i++)
        {
            if(A%i==0 && B%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
}
/*
* 4 = 2*2
* 8 = 2*2*2
* */
