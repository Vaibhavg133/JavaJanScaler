package com.company.Recursion;

public class sumOfDigit {
    public static void main(String[] args) {
        int solve = sumDigit(1233);
        System.out.println(solve);
    }
    public static int sumDigit(int A)
    {
        if(A==0)
        {
            return A;
        }
        int sum=A%10;
        return sum+sumDigit(A/10);
    }

}
