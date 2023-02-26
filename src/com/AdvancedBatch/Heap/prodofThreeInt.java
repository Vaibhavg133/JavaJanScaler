package com.AdvancedBatch.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prodofThreeInt {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
       Heap myHeap = new Heap(A.length+100);
       ArrayList<Integer> result = new ArrayList<>();
       for(int i=0;i<A.length;i++)
       {
           myHeap.insert(A[i]);
           if(i<2)
           {
               result.add(-1);
           }
           else
           {
               int topa = myHeap.getRoot();
               myHeap.removeMax();
               int topb = myHeap.getRoot();
               myHeap.removeMax();
               int topc = myHeap.getRoot();
               myHeap.removeMax();
               myHeap.insert(topa);
               myHeap.insert(topb);
               myHeap.insert(topc);
               result.add((topa*topb*topc));
           }
       }
        System.out.println(result);
//        for(int i=0;i<A.length;i++)
//        {
//            myHeap.insert(A[i]);
//            System.out.println();
//            System.out.println("MAX : "+myHeap.getRoot()+"\n");
//            myHeap.printHeap();
//        }
//        ArrayList<Integer> myList = new ArrayList<>();
//        for(int i=0;i<A.length;i++)
//        {
//            if(i==0)
//            {
//                myHeap.insert(A[i]);
//                System.out.println(myHeap.getRoot());
//                System.out.println();
//                myHeap.printHeap();
//            }
//            else
//            {
//                int getMax= myHeap.getRoot();
//                int newNumber = A[i]*getMax;
//                myHeap.insert(newNumber);
//                System.out.println(myHeap.getRoot());
//                System.out.println();
//                myHeap.printHeap();
//            }
//        }
//        for(int i=A.length;i>=1;i--)
//        {
//            if(i<3)
//            {
//                myList.add(-1);
//            }
//            else
//            {
//                myList.add(myHeap.getRoot());
//                myHeap.removeMax();
//            }
//        }
//        System.out.println(myList);
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i= myList.size()-1;i>=0;i--)
//        {
//            result.add(myList.get(i));
//        }
//        System.out.println();
//        System.out.println(result);
    }
}
class Heap
{
    int maxSize;
    int size;
    int[] arr;
    public Heap(int maxSize)
    {
        this.maxSize=maxSize;
        this.size=0;
        this.arr=new int[maxSize];
    }
    public int getRoot()
    {
        return arr[1];
    }
    public void insert(int data)
    {
        if(size<maxSize)
        {
            size=size+1;
            arr[size]=data;
            int index=size;
            while(index>1)
            {
                if(arr[index]>arr[index/2])
                {
                    //swap
                    int temp = arr[index];
                    arr[index]=arr[index/2];
                    arr[index/2]=temp;
                    index=index/2;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public void printHeap()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void removeMax() {
        if (size >= 1) {
            arr[1] = arr[size];
            size--;
            int index = 1;
            while (index < size) {
                int parent = index;
                int leftChild = 2 * index;
                int rightChild = (2 * index) + 1;
                if (arr[leftChild] > arr[rightChild]) {
                    //swap parent with left child
                    int temp = arr[parent];
                    arr[parent] = arr[leftChild];
                    arr[leftChild] = temp;
                    index = leftChild;
                } else {
                    //swap parent with right child
                    int temp = arr[parent];
                    arr[parent] = arr[rightChild];
                    arr[rightChild] = temp;
                    index = rightChild;
                }
            }
        }
    }


}
