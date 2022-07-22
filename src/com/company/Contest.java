package com.company;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] Matrix = new int[N+1][M+1];
        int count=1;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=M;j++)
            {
                Matrix[i][j]=count;
                count++;
            }
        }
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=M;j++)
            {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
