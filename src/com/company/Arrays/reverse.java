package com.company.Arrays;

public class reverse {
    public static void main(String[] args) {
        //int[] arr = {-1,4,7,6,-2,7,8,10};
        int[] arr = {1,2,3};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int N = arr.length;
        for(int i=0;i<N/2;i++)
        {
            int temp = 0;
            temp=arr[i];
            arr[i]=arr[N-i-1];
            arr[N-i-1]=temp;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
