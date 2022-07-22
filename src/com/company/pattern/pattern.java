package com.company.pattern;

public class pattern {
    public static void main(String[] args) {
 //   triangle(4);
        //        rightSideTriangle(4);
//        decreasingTrianglePattern(4);
//       increasingTrianglePattern(4);
        int N = 4;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N-i+1;j++)
            {
                System.out.print("* ");
            }

            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=N-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<N-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<N-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangle(int N)
    {
        /*
            * * * *
            - * * *
            - - * *
            - - - *
        */
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=N-i;j++)
            {
                System.out.print(" *");
            }

            System.out.println();
        }
    }

    public static void rightSideTriangle(int N)
    {
        /*
                - - - *
                - - * *
                - * * *
                * * * *

         */
        for(int i=1;i<=N;i++)
        {
            for(int j=i;j<N;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<i+1;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void increasingTrianglePattern(int N)
    {
        /*
           *
           * *
           * * *
           * * * *
        */
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void decreasingTrianglePattern(int N)
    {
        /*
                * * * *
                * * *
                * *
                *
         */
        for(int i=1;i<=N;i++)
        {
            for(int j=N-i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
