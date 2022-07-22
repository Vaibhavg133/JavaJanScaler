package com.company.Jan;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int rr = number;
//        int arm=0;
//        while(number!=0)
//        {
//            int rem=number%10;
//            arm=arm+(rem*rem*rem);
//            number=number/10;
//        }
//        if(rr==arm)
//        {
//            System.out.println("Arm");
//        }
        int n=10;
        for(int i=1;i<=n*n+1;i=i+2)
        {
            System.out.println(i);
        }
    }
}
