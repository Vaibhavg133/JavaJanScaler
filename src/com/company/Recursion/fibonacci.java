package com.company.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int A = 9;
        int sol = solve(A);
        System.out.println(sol);
    }
    public static int solve(int N)
    {
        if(N==0 || N==1)
        {
            return N;
        }
        int sum=solve(N-1)+solve(N-2);
        return sum;
    }

}
