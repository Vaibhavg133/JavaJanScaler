package com.CodeChef.Starters._71.Starters72;

import java.util.Scanner;

public class indivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0)
        {
            int[] A = new int[3];
            for(int i=0;i<A.length;i++)
            {
                A[i]=sc.nextInt();
            }
            for(int i=2;i<100;i++)
            {
                if(A[0]%i!=0 && A[1]%i!=0 && A[2]%i!=0)
                {
                    System.out.println(i);
                    break;
                }
            }
            testCase--;
        }
    }
}
