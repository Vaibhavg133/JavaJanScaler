package com.company.BitManipulation;

public class XOR {
    public static void main(String[] args) {
        //int[] A = {2,8,3,1,2,2,3,2,8,1,1,1};
        //int res = 0;
        //for(int i=0;i<A.length;i++)
        //{
        //    res=res^A[i];
        //}
        //System.out.println(res);
        int N = 6;
        int count=0;
        while(N!=0)
        {
            N=N&(N-1);
            count++;
        }
        System.out.println(count);
    }
}
