package com.CodeChef.Starters._71.Starters72;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int min = Math.min(A,B);
            int myAns = 1;
            for(int i=1;i<=Math.min(A,B);i++)
            {
                if(A%i==0 && B%i==0)
                {
                    myAns=i;
                }
            }
            System.out.println(myAns);
            testCase--;
        }
    }
}
