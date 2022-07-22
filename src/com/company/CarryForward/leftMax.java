package com.company.CarryForward;

public class leftMax {
    public static void main(String[] args) {
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int[] LM = new int[A.length];
        LM[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            LM[i]=Math.max(LM[i-1],A[i]);
        }
        System.out.println("LeftMaxArray");
        for(int i=0;i<LM.length;i++)
        {
            System.out.print(LM[i]+" ");
        }
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
        System.out.println();
        System.out.println("RightMaxArray");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(RM[i]+" ");
        }
    }
}
