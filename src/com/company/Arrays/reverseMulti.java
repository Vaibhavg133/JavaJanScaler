package com.company.Arrays;

public class reverseMulti {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {2,3};
        int [][] result = solve(A,B);
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static int[][] solve(int[] A, int[] B)
    {
        int r=B.length;
        int c=A.length;
        int[][] result = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                result[i][j]=0;
            }
        }

        for(int i=r-1;i>=0;i--)
        {
            int number = B[i];
            int [] temp = A;
            reverse(temp, 0, temp.length-1);
            reverse(temp, 0, number-1);
            reverse(temp, number, temp.length-1);

            for(int j=0;j<r;j++)
            {
                for(int k=0;k<c;k++)
                {
                    result[j][k]=temp[k];
                }
            }
        }
        return result;
    }
    public static void reverse(int[] A, int start, int end)
    {
        int i=start;
        int j=end;
        while(i<j)
        {
            int temp = A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
    }

}
