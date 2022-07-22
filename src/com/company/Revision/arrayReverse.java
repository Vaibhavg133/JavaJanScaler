package com.company.Revision;

import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Arr = {1,2,3,4,5,6,7,8,9,10,11};
        int B = 2;
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        reverse(Arr,0,Arr.length-1);
        reverse(Arr,0,B-1);
        reverse(Arr,B,Arr.length-1);
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
//        System.out.println();
//        //reverse(Arr,Arr.length);
//        for(int i=0;i<Arr.length;i++)
//        {
//            System.out.print(Arr[i]+" ");
//        }
//        System.out.println();
//        reverse(Arr,3,8);
//        for(int i=0;i<Arr.length;i++)
//        {
//            System.out.print(Arr[i]+" ");
//        }
//        System.out.println();
    }
    public static void reverse(int[] Arr, int s, int e)
    {
        int i=s;
        int j=e;
        while(i<j)
        {
            int temp = Arr[i];
            Arr[i]=Arr[j];
            Arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void reverse(int[] Arr, int N)
    {
        int i=0;
        int j=N-1;
        while(i<j)
        {
            int temp = Arr[i];
            Arr[i]=Arr[j];
            Arr[j]=temp;
            i++;
            j--;
        }
    }
}
