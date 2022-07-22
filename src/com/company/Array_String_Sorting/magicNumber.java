package com.company.Array_String_Sorting;

public class magicNumber {
    public static void main(String[] args) {
        int N = 6;
        int res = 0;
        int pow=5;
        while(N!=0)
        {
            int last_bit = N&1;
            res=res+last_bit*pow;
            N=N>>1;
            pow=pow*5;
        }
        System.out.println(res);
    }
}
