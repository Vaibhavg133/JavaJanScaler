package com.AdnacedBatch.Arrays2;

public class _2DPrefix {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] PStwoD = new int[A.length][A[0].length];
        for(int i=0;i<PStwoD.length;i++)
        {
            for(int j=0;j<PStwoD[0].length;j++)
            {
                PStwoD[i][j]=0;
            }
        }
        for(int i=0;i<A[0].length;i++)
        {
            if(i==0)
            {
                PStwoD[0][i] = A[0][i];
            }
            else
            {
                PStwoD[0][i]=PStwoD[0][i-1]+A[0][i];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                PStwoD[i][0]=A[i][0];
            }
            else
            {
                PStwoD[i][0]=PStwoD[i-1][0]+A[i][0];
            }
        }
        for(int i=1;i< A.length;i++)
        {
            for(int j=1;j<A[0].length;j++)
            {
                PStwoD[i][j]= PStwoD[i-1][j]+PStwoD[i][j-1]- PStwoD[i-1][j-1]+A[i][j];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print(PStwoD[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
