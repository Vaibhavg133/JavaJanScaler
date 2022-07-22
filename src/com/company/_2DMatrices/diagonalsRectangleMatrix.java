package com.company._2DMatrices;

public class diagonalsRectangleMatrix {
    public static void main(String[] args) {
        int[][] matRect= {{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15}};
        diagonalRLRectangle(matRect);
    }
    public static void diagonalRLRectangle(int[][] mat)
    {
        for(int j=0;j<mat[0].length;j++)
        {
            int x=0;
            int y=j;
            while(x< mat.length && y>=0)
            {
                System.out.print(mat[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        for(int i=1;i<mat.length;i++)
        {
            int x=i;
            int y=mat[0].length-1;
            while(x< mat.length && y>=0)
            {
                System.out.print(mat[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }

}
