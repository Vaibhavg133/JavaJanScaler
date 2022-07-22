package com.AdnacedBatch.Arrays3;

public class makeZeio {
    public static void main(String[] args) {
        int[][] A = {{2,3,4,3},{2,0,7,1},{6,5,8,1},{1,1,0,1}};
        int[][] B = new int[A.length][A[0].length];
        B=A;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j]==0)
                {
                    for(int k=0;k<A[0].length;k++)
                    {
                        B[i][k]=0;
                    }
                    for(int k=0;k<A.length;k++)
                    {
                        B[k][i]=0;
                    }
                }
                else
                {
                    B[i][j]=A[i][j];
                }
            }
        }
        /**/
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
