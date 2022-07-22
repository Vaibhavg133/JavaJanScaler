package com.company._2DMatrices;

public class matrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        transpose(matrix);
//        printMatrix(matrix);
//        reverse(matrix);
        reverseMat(matrix);
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }
    public static void reverseMat(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int start=0,end=A.length-1;start<end;start++,end--)
            {
                int temp = A[i][start];
                A[i][start]=A[i][end];
                A[i][end]=temp;
                start++;
                end--;
            }
        }
    }

    public static void reverse(int[] A)
    {
        for(int i=0;i<A.length/2;i++)
        {
            int temp = A[i];
            A[i]=A[A.length-i-1];
            A[i+1]=temp;
        }
    }
}
