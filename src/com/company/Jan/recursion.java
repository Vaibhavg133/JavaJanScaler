package com.company.Jan;

import com.sun.security.jgss.GSSUtil;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;


public class recursion {
    public static void print(int N)
    {
        if(N==0)
        {
            return;
        }
        else
        {
            print(N-1);
            System.out.print(N+" ");
        }
    }

    public static void printNto1(int N)
    {
        if(N==0)
        {
            return;
        }
        else
        {
            System.out.print(N+" ");
            printNto1(N-1);
        }
    }
    public static int powerFunc(int A, int B)
    {
        if(A==0||B==0)
        {
            return 1;
        }
        return A*powerFunc(A,B-1);
    }

    public static int sumOfDigit(int N)
    {
        if(N==0)
        {
            return 0;
        }
        return (N%10+sumOfDigit(N/10));
    }

    public static int gcd(int A,int B)
    {
        if(A==0)
        {
            return B;
        }
        else
        {
            return gcd(B%A,A);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int A = sc.nextInt();
        //int B = sc.nextInt();
        //int B = sc.nextInt();
        //int power = powerFunc(A,B);
        //System.out.println(power);
//        int some=sumOfDigit(A);
//        System.out.println(some);
//        Math.pow(5,2);
//        int A=sc.nextInt();
//        String res = "";
//        while(A!=0)
//        {
//            int rem = A%2;
//            res+=rem;
//            A=A/2;
//        }
//        String DecimalToBinary="";
//        for(int i=res.length()-1;i>=0;i--)
//        {
//            DecimalToBinary+=res.charAt(i);
//        }
//        //System.out.println(DecimalToBinary);
//        int binary=Integer.parseInt(DecimalToBinary);
//        System.out.println(binary);


    }
    public static int binary(int A)
    {
        int res;
        res=0;
        while(A!=0)
        {
            int rem = A%10;
        }
        return res;
    }

    public static boolean isFibo(int N)
    {
        if(N==0||N==1)
        {
            return true;
        }
        int a=0,b=1;
        int c;
        for(int i=2;i<=N;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(c==N)
            {
                return true;
            }
        }
        return false;
    }

}
