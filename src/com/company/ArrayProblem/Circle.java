package com.company.ArrayProblem;

public class Circle {
    public static void main(String[] args) {
        int N = 4;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N-i;j++)
            {
                System.out.print("*");
            }
//            for(int j=)
            //for(int i)
            System.out.println();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=N-i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
