package com.company.Revision;

import java.util.Scanner;

public class leftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1,2,3,4,5};
        int[] B = {2,3};
        int[][] result = solve(A,B);
        for(int i=0;i< result.length;i++)
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
        int r = B.length;
        int c = A.length;
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++)
        {
            int K = B[i];
            int[] array = new int[A.length];
            array=A;
            reverse(array,0,K-1);
            reverse(array,K, array.length-1);
            reverse(array,0,array.length-1);
            for(int a=0;a<c;a++)
            {
                res[i][a]=array[a];
            }
        }
        return res;
    }
    public static void reverse(int[] array, int start, int end)
    {
        int i=start;
        int j=end;
        while(i<j)
        {
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }
}
