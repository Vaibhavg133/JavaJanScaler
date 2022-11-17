package com.AdvancedBatch.recursion;

public class power {
    public static void main(String[] args) {
        int res = pow(3,3);
        System.out.println(res);
    }
    public static int pow(int A, int B)
    {
        if(B==0)
        {
            return 1;
        }
        return A*pow(A,B-1);
    }

}
