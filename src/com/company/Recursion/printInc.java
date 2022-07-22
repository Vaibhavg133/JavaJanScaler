package com.company.Recursion;

public class printInc {
    public static void main(String[] args) {
        printIncc(5);
        System.out.println();
        printDec(5);
    }
    static void printIncc(int N)
    {
        //base case;
        if(N==0)
        {
            return;
        }
        //rec case
        printIncc(N-1);
        System.out.print(N);
    }
    static void printDec(int N)
    {
        if(N==0)
        {
            return;
        }
        System.out.print(N);
        printDec(N-1);
    }


}
