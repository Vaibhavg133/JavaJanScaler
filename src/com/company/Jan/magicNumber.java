package com.company.Jan;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int binarya=binary(A);
        System.out.println(binarya);
        int res=binaryToBase5(binarya);
        System.out.println(res);
    }
    public static int binary(int A)
    {
        String res="";
        while(A!=0)
        {
            int rem = A%2;
            res+=rem;
            A=A/2;
        }
        String DecimalToBinary="";
        for(int i=res.length()-1;i>=0;i--)
        {
            DecimalToBinary+=res.charAt(i);
        }
        int binary=Integer.parseInt(DecimalToBinary);
        return binary;
    }
    public static int binaryToBase5(int bin)
    {
        int res=0;
        int i=1;
        while(bin!=0)
        {
            int rem = bin%10;
            //res=res+(rem*power(5,i));
            //res=res+(rem*((int)(Math.pow(5,i))));
            //i++;
            //res=res+(rem*(int)(Math.Pow((double)(5),(double)(i))));
            //res=res+(rem*(int)(Math.Pow(5,i)));
            res=res+(rem*power(5,i));
            bin/=10;
            i++;
        }
        return res;
    }
    public static int power(int A,int B)
    {
        int res=1;
        for(int i=0;i<B;i++)
        {
            res=res*A;
        }
        return res;
    }
}
