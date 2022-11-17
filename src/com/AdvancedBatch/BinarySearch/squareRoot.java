package com.AdvancedBatch.BinarySearch;

public class squareRoot {
    public static void main(String[] args) {
        int N = 50;
        int solve= squareRoot(N);
        System.out.println(solve);

    }
    public static int squareRoot(int N)
    {
        int s=0;
        int e=N;
        int ans=0;
        while(s!=e)
        {
            int mid = (s+e)/2;
            if(mid*mid<=N)
            {
                ans=mid;
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        if(ans*ans==N)
        {
            return ans;
        }
        else
        {
            return ans+1;
        }
    }

}
