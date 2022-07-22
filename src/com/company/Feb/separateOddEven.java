package com.company.Feb;

import java.util.Scanner;

public class separateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int evenC = 0;
        int oddC = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                even[evenC]=A[i];
                evenC++;
            }
            else
            {
                odd[oddC]=A[i];
                oddC++;
            }
        }
        //System.out.println();
        for(int i=0;i<odd.length;i++)
        {
            System.out.print(odd[i]+" ");
        }
        System.out.println();
        for(int i=0;i<even.length;i++)
        {
            System.out.print(even[i]+" ");
        }

    }
}
