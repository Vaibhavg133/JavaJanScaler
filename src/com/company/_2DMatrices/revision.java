package com.company._2DMatrices;

public class revision {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] C = {
                        {1,2,3,4,5,6},
                        {7,8,9,10,11,12},
                        {13,14,15,16,17,18},
                        {19,20,21,22,23,24},
                        {25,26,27,28,29,30}
                    };
        int[][] D = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        transpose(D);
        reverse(D);
        printMatrix(D);
//        diagonalsRectangleMatrix(C);
//        rowSum(A);
//        System.out.println();
//        colSum(A);
//        System.out.println();
//        diagonalLtoR(B);
//        System.out.println();
//        diagonalRtoL(B);
//        System.out.println();
//        diagonalRtoLOpti(B);
    }
    public static void reverse(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            int C = A[i].length;
            for(int j=0;j<C/2;j++)
            {
                int temp = A[i][j];
                A[i][j] = A[i][A.length-j-1];
                A[i][A.length-j-1] = temp;
            }
        }
    }

    public static void transpose(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                int temp = A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
    }

    public static void printMatrix(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void diagonalsRectangleMatrix(int[][] A)
    {
        for(int i=0;i<A[0].length;i++)
        {
            int x=0,y=i;
            while(x<A.length && y>=0)
            {
                System.out.print(A[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        for(int i=1;i<A.length;i++)
        {
            int x=i,y=A[0].length-1;
            while(x<A.length && y>=0)
            {
                System.out.print(A[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
    public static void diagonalLtoR(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i][i]+" ");
        }
    }
    public static void diagonalRtoLOpti(int[][] A)
    {
        for(int i=0,j=A.length-1;i<A.length;i++,j--)
        {
            System.out.print(A[i][j]+" ");
        }
    }

    public static void diagonalRtoL(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(i+j==A.length-1)
                {
                    System.out.print(A[i][j]+" ");
                }
                //System.out.print(A[i][j]+" ");
            }
        }
    }
    public static void rowSum(int[][] A)
    {
        for(int i=0;i<A.length;i++)
        {
            int rowSum=0;
            for(int j=0;j<A[i].length;j++)
            {
                rowSum+=A[i][j];
            }
            System.out.println(rowSum);
        }
    }
    public static void colSum(int[][] A)
    {
        for(int i=0;i<A[0].length;i++)
        {
            int colSum=0;
            for(int j=0;j<A.length;j++)
            {
                colSum+=A[j][i];
            }
            System.out.println(colSum);
        }
    }

}
