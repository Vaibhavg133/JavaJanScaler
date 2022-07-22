package com.company.Recursion;

public class factorial {
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }
    public static int factorial(int N)
    {
        if(N==0 || N==1)
        {
            return 1;
        }
        return N*factorial(N-1);
    }

}
