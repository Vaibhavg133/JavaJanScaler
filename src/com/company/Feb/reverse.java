package com.company.Feb;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int B = sc.nextInt();
        if(B>n)
        {
            B=B%n;
        }
        revert(A,0,n-1);
        revert(A,0,B-1);
        revert(A, B,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void revert(int[] A, int start, int end)
    {
        int i,j;
        i=start;
        j=end;
        while(i<j)
        {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

}
