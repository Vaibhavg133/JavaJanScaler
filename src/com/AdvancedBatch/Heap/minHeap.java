package com.AdvancedBatch.Heap;

import java.util.PriorityQueue;

public class minHeap {
    public static void main(String[] args) {
        int[] A = {2,3,1,5,4};//{-43, -1, 19, 87, -45};//{57, 3, -14, -87, 42, 38, 31, -7, -28, -61};//{24,-68,-29,-9,84};//{2,3,1,5,4};
        int B = 5;

//        while(B!=0)
//        {
//            int min = myPQ.poll();
//            if(min<0)
//            {
//                min=min*-1;
//                myPQ.add(min);
//            }
//            else if(min>=0)
//            {
//                if(B%2==0)
//                {
//                    break;
//                }
//                else
//                {
//                    min=min*-1;
//                    myPQ.add(min);
//                    break;
//                }
//            }
//            B--;
//        }
//        int sum=0;
//        while(myPQ.size()!=0)
//        {
//            sum+=myPQ.poll();
//        }
//        System.out.println(sum);
        MiinHeap heap = new MiinHeap(A.length+10);
        for(int i=0;i<A.length;i++)
        {
            heap.insert(A[i]);
        }
        heap.printHeap();
        System.out.println();
        heap.removeMin();
        System.out.println();
        heap.printHeap();
//        heap.delete();
//        heap.printHeap();
//        System.out.println();
//        while(B!=0)
//        {
//            int myMin = heap.getMin();
//            if(myMin<0)
//            {
//                myMin=myMin*-1;
//                heap.
//            }
//            B--;
//        }
    }
}
class MiinHeap
{
    int[] arr;
    int size;
    int maxSize;
    public MiinHeap(int maxSize)
    {
        this.maxSize=maxSize;
        this.size=0;
        this.arr=new int[maxSize];
    }
    public void insert(int data)
    {
        if(size<=maxSize)
        {
            size=size+1;
            arr[size]=data;
            int index=size;
            while(index>1)
            {
                if(arr[index]<arr[index/2])
                {
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
    public int getMin()
    {
        return arr[1];
    }
    public void printHeap()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void delete()
    {
        if(size>1)
        {
            arr[1]=arr[size];
            size--;
            int idx=1;
            while(idx<size)
            {
                int left = arr[2*idx];
                int right = arr[2*idx+1];
                int smaller = -1;
                if(left<right)
                {
                    smaller=left;
                }
                else {

                    smaller=right;
                }
                if(arr[idx]<arr[smaller])
                {
                    int temp = arr[idx];
                    arr[idx]=arr[smaller];
                    arr[smaller]=temp;
                    idx=smaller;
                }
                else
                {
                    return;
                }
            }
        }
    }

    void removeMin()
    {
        if(size>=1)
        {
            arr[1]=arr[size];
            size--;
            int idx=1;
            while(idx<size)
            {
                int parent = idx;
                int leftChild = 2*idx;
                int rightChild = (2*idx)+1;
                int temp = arr[parent];
                if(arr[leftChild]<arr[rightChild])
                {
                    //swap left with parent
                    arr[parent]=arr[leftChild];
                    arr[leftChild]=temp;
                    idx=leftChild;
                }
                else
                {
                    arr[parent]=arr[rightChild];
                    arr[rightChild]=temp;
                    idx=rightChild;
                }
            }
        }
    }




}

