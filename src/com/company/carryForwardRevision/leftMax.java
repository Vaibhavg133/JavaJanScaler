package com.company.carryForwardRevision;

public class leftMax {
    public static void main(String[] args) {
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int[] LM = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                LM[i]=A[i];
            }
            else
            {
                LM[i]=Math.max(LM[i-1],A[i]);
            }
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=0;i<A.length;i++)
        {
            System.out.print(LM[i]+" ");
        }
    }
}
