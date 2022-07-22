package com.company._2DMatrices;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15},
                          {16,17,18,19,20},
                          {21,22,23,24,25}};

        transpose(matrix);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
