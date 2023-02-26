package com.AdvancedBatch.Heap;

import java.util.ArrayList;

public class MaxHeapUsingArrayList {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        MaxHeap myMaxHeap = new MaxHeap();
        for(int i : A)
        {
            myMaxHeap.insert(i);
        }
        myMaxHeap.printList();
        System.out.println();
        while(myMaxHeap.size!=0)
        {
            System.out.println();
            myMaxHeap.printList();
            myMaxHeap.removeMax();
        }
    }
}
class MaxHeap
{
    ArrayList<Integer> list;
    int size;
    public MaxHeap()
    {
        size=0;
        list=new ArrayList<>();
    }

    public void insert(int data)
    {
        list.add(data);
        size=size+1;
        int index=list.size()-1;
        while(index>0)
        {
            if(list.get(index)>list.get(index/2))
            {
                int temp = list.get(index);
                list.set(index,list.get(index/2));
                list.set(index/2,temp);
                index=index/2;
            }
            else {
                break;
            }
        }
    }
    public void printList()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public void removeMax()
    {
        if(size>=0)
        {
            list.set(0,list.get(list.size()-1));
            size--;
            int index=0;
            while(index<size)
            {
                int parent=index;
                int leftChild = (2*index)+1;
                int rightChild = (2*index)+2;
                int temp = list.get(parent);
                if(leftChild<=size && rightChild<=size)
                {
                    if(list.get(leftChild)>list.get(rightChild))
                    {
                        //swap left with parent
                        list.set(parent,list.get(leftChild));
                        list.set(leftChild,temp);
                        index=leftChild;
                    }
                    else
                    {
                        //swap right with parent
                        list.set(parent,list.get(rightChild));
                        list.set(leftChild,temp);
                        index=rightChild;
                    }
                }
                else
                {
                    break;
                }
            }
        }
    }




}

