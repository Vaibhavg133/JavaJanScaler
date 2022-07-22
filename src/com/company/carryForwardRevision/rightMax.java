package com.company.carryForwardRevision;

public class rightMax {
    public static void main(String[] args) {
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int[] RM = new int[A.length];
        for(int i=A.length-1;i>=0;i--)
        {
            if(i==A.length-1)
            {
                RM[i]=A[i];
            }
            else
            {
                RM[i]=Math.max(RM[i+1],A[i]);
            }
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=0;i<A.length;i++)
        {
            System.out.print(RM[i]+" ");
        }
    }
}
