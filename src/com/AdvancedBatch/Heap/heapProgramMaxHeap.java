package com.AdvancedBatch.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class heapProgramMaxHeap {
    public static void main(String[] args) {


        int[] A = {25, 16, 11, 31, 28, 20, 3, 8};//{13,10,6,2,3,4,0,1};
        //HeapMax myHeap = new HeapMax(A.length);
        PriorityQueue<Integer> myHeap = new PriorityQueue<>();
        for(int i : A)
        {
            myHeap.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(myHeap.size()!=0)
        {
            list.add(myHeap.poll());
            //myHeap.removeMax();
        }
        System.out.println(list);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--)
        {
            result.add(list.get(i));
        }
        System.out.println(result);
//        myHeap.printHeapArray();
//        System.out.println();
//        myHeap.removeMax();
//        myHeap.printHeapArray();
//        myHeap.removeMax();
//        System.out.println();
//        myHeap.printHeapArray();

    }
}
class HeapMax
{
    int[] arr;
    int maxSize;
    int size;
    HeapMax(int maxSize)
    {
        this.maxSize=maxSize;
        this.size=0;
        arr=new int[maxSize];
    }
    void insert(int data)
    {
        size=size+1;
        if(size<maxSize)
        {
            arr[size]=data;
            int index = size;
            while(index>1)
            {
                if(arr[index]>arr[index/2])
                {
                    int temp = arr[index];
                    arr[index]=arr[index/2];
                    arr[index/2]=temp;
                    //swap(arr[index],arr[index/2]);
                    index=index/2;
                }
                else
                {
                    break;
                }
            }
        }
    }
    void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
    }
    void printHeapArray()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    int getMax()
    {
        return arr[1];
    }
    void removeMax()
    {
        if(size>=1)
        {
            arr[1]=arr[size];
            size--;
            int index=1;
            while(index<size)
            {
                int parent = index;
                int leftChild = 2*index;
                int rightChild = (2*index)+1;
                if(arr[leftChild]>arr[rightChild])
                {
                    //swap parent with left child
                    int temp = arr[parent];
                    arr[parent]=arr[leftChild];
                    arr[leftChild]=temp;
                    index=leftChild;
                }
                else
                {
                    //swap parent with right child
                    int temp = arr[parent];
                    arr[parent]=arr[rightChild];
                    arr[rightChild]=temp;
                    index=rightChild;
                }
            }
        }

    }


}



