package com.company.Jan;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,8,3,15,7,6,2};
        int N=arr.length;
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        //int N=sc.nextInt();
        //int i=0;
//        while(i*i<=N)
//        {
//            i++;
//        }
//        System.out.print(i-1);
    }
    public static int[] insertElementAt(int[] arr, int N, int element, int position)
    {
        int[] new_arr = new int[N+1];
        for(int i=0;i<N+1;i++)
        {
            if(i>(position-1))
            {
                new_arr[i]=arr[i-1];
            }
            else if(i==(position-1))
            {
                new_arr[i]=element;
            }
            else
            {
                new_arr[i]=arr[i];
            }
        }
        return new_arr;
    }
    public static int firstMissingPositive(int[] A)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //int max=0;
        for(int i=0;i<A.length;i++)
        {
            if(max<=A[i]) {
                max = A[i];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(min>=A[i])
            {
                min=A[i];
            }
        }
        int result=0;
        if(min<0 || max<0)
        {
            for(int i=min;i<=max;i++)
            {

            }
        }
        else if(min>=0 && max>=0)
        {
            result=max+1;
        }
        else if(min<0 && max<0)
        {
            result=0;
        }
        return 1;
        //return min;
    }
}
