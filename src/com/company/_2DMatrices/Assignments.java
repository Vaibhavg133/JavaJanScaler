package com.company._2DMatrices;

public class Assignments {
    public static void main(String[] args) {
        int A = 5;
        int[][] res = new int[A][A];
        initialization(res,0);
        int i=0,j=0,k=1,dir=0;
        while(k<=A*A)
        {
            res[i][j]=k;
            k++;
            if(dir==0)
            {
                j++;
                if(j==A || res[i][j]!=0)
                {
                    dir=1;
                    j--;
                    i++;
                }
            }
            else if(dir==1)
            {
                i++;
                if(i==A || res[i][j]!=0)
                {
                    dir=2;
                    i--;
                    j--;
                }
            }
            else if(dir==2)
            {
                j--;
                if(j<0 || res[i][j]!=0)
                {
                    dir=3;
                    i--;
                    j++;
                }
            }
            else if(dir==3)
            {
                i--;
                if(i<0 || res[i][j]!=0)
                {
                    dir=0;
                    i++;j++;
                }
            }
        }
        printMatrix(res);

    }
    public static void initialization(int[][] A,int value)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                A[i][j]=value;
            }
        }
    }

    public static void printMatrix(int[][] A)
    {
        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

}
