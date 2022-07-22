package com.company._2DMatrices;

public class rowSumColSum {
    public static void main(String[] args) {
        int[][] matric = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        //Row Sum;
        for(int i=0;i<matric.length;i++)
        {
            int rowSum = 0;
            for(int j=0;j<matric[i].length;j++)
            {
                rowSum+=matric[i][j];
            }
//            System.out.println(rowSum);
        }
        //ColSum
        for(int i=0;i<matric.length;i++)
        {
            int colSum=0;
            for(int j=0;j<matric.length;j++)
            {
                colSum+=matric[j][i];
            }
            System.out.println(colSum);
        }
    }
}
