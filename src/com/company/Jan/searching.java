package com.company.Jan;

import java.util.Scanner;

public class searching {
    public static int binarySearch(int[] arr, int x)
    {
        int start=0;
        int end=arr.length-1;
        //int mid=(start+end)/2;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>x)
            {
                end=mid-1;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else{
                return mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N=sc.nextInt();
        int[] arr = {10,10,10,10,20,30,40,50,60,70,80,90,100};
        //int res = ;
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("First Occurence= "+binarySearchAll(arr,10,true));
        System.out.println("Last Occurence ="+binarySearchAll(arr,10,false));
        int[] arr2 = binarySearchOccurence(arr,10);
        for(int x:arr2)
        {
            System.out.print(x+" ");
        }
        //        System.out.println();
//        System.out.println(binarySearch(arr,50));
        //int[] arrnew=binarySearchAll(arr,10);
//        for(int x:arrnew)
//        {
//            System.out.print(x+" ");
//        }
        //System.out.println(binarySearchAll(arr,10));
    }
    public static int[] binarySearchOccurence(int[] arr, int key)
    {
        //int[] res = new int[arr.length];
        int first=binarySearchAll(arr,key,true);
        int last=binarySearchAll(arr,key,false);
        int[] res = new int[last-first+1];
        int count=0;
        for(int i=first;i<=last;i++)
        {
            res[count]=arr[i];
            count++;
        }
        return res;
    }

    public static int binarySearchAll(int[] arr, int key, boolean first)
    {
        int[] res=new int[arr.length];
        int start=0;
        //int resIndex=0;
        int ans=-1;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                if(first) {
                    end = mid - 1;
                }
                else
                {
                    start=mid+1;
                }
                //start=mid+1;
            }
            else if(arr[mid]>key)
            {
                end=mid-1;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
        }
        return ans;
    }
}
