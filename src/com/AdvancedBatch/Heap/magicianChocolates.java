package com.AdvancedBatch.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class magicianChocolates {
    public static void main(String[] args) {
        int[] A = {6,5};
        int B = 5;
        int[] AA = {2,4,6,8,10};//{78, 46, 53, 43, 79, 46, 79, 80, 65, 81, 39, 84, 63, 24, 54, 42, 99, 15, 86, 45, 51, 47, 94, 35, 15, 30, 23};
        ArrayList<Integer> myList = new ArrayList<>();
        HeaMax myH = new HeaMax(AA.length+10);
        for(int i : AA)
        {
            myH.insert(i);
        }
        while(myH.size!=0)
        {
            myList.add(myH.poll());
            myH.delete();

        }
        System.out.println(myList);
//        HeaMax myHeap = new HeaMax(AA.length+10);
//        for(int i : AA)
//        {
//            myHeap.insert((i));
//        }
//        int cost = 0;
//        while(B!=0)
//        {
//            long max = myHeap.poll();
//            myHeap.delete();
//            cost+=max;
//            int filled=(int)(max/2);
//            myHeap.insert(filled);
//            B--;
//        }
//        System.out.println(cost);
        PriorityQueue<Integer> myq = new PriorityQueue<>();
        for(int i=0;i<AA.length;i++)
        {
            myq.add(AA[i]);
        }
        int cost = 0;
        while(B!=0)
        {
            int min = myq.poll();
            cost+=min;
            int filled = min/2;
            myq.add(filled);
            B--;
        }
        System.out.println(cost);
    }

}
class HeaMax
{
    int[] arr;
    int size;
    int maxSize;
    public HeaMax(int maxSize)
    {
        this.maxSize=maxSize;
        this.size=0;
        this.arr=new int[maxSize];
    }
    int poll()
    {
        return arr[1];
    }
    void insert(int data)
    {
        size++;
        if(size<maxSize)
        {
            arr[size]=data;
            int idx = size;
            while(idx>1)
            {
                if(arr[idx]>arr[idx/2])
                {
                    int temp = arr[idx];
                    arr[idx]=arr[idx/2];
                    arr[idx/2]=temp;
                    idx=idx/2;
                }
                else
                {
                    break;
                }
            }
        }
    }
    void delete()
    {
        arr[1]=arr[size];
        size=size-1;
        int index=1;
        while(index<size)
        {
            int parent = index;
            int leftChild = 2*index;
            int rightChild = (2*index)+1;
            int temp = arr[parent];
            if(arr[leftChild]>arr[rightChild])
            {
                //swap parent with left
                arr[parent]=arr[leftChild];
                arr[leftChild]=temp;
                index=leftChild;
            }
            else
            {
                //swap parent with right
                arr[parent]=arr[rightChild];
                arr[rightChild]=temp;
                index=rightChild;
            }
        }
    }
    void printHeap()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



}
