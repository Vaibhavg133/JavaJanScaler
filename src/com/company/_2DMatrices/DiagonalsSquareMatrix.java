package com.company._2DMatrices;

public class DiagonalsSquareMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        //printDiagonalLR(mat);
        printDiagonalRL(mat);


    }
    public static void printDiagonalRL(int[][] mat)
    {
        int i=0;
        int j= mat.length-1;
        while(i<mat.length && j>=0)
        {
            System.out.print(mat[i][j]+" ");
            System.out.println();
            i++;
            j--;
        }
    }

    public static void printDiagonalLR(int[][] mat)
    {
        int i=0;
        while(i<mat.length)
        {
            System.out.print(mat[i][i]+" ");
            i++;
            System.out.println();
        }
    }

}
