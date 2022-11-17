package com.AdvancedBatch.BinarySearch;

public class trailingZeroes {
    public static void main(String[] args) {
        int N = 101000;
        int ans = bruteForce(N);
        System.out.println(ans);
    }
    public static int bruteForce(int Number)
    {
        int ans=0;
        while(Number!=0)
        {
            int rem = Number%10;
            if(rem==0)
            {
                ans++;
            }
            else
            {
                break;
            }
            Number=Number/10;
        }
        return ans;
    }

}
