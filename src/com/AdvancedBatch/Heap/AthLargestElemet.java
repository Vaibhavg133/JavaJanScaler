package com.AdvancedBatch.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class AthLargestElemet {
    public static void main(String[] args) {
        ArrayList<Integer> sub  = new ArrayList<>();
        ArrayList<Integer> myList = new ArrayList<>();
        int[] B = {1,2,3,4,5,6};
        int A = 4;
        PriorityQueue<Integer> myHeap = new PriorityQueue<>();
        for(int i=0;i<A;i++)
        {
            myHeap.add(B[i]);
            if(i<A-1)
            {
                myList.add(-1);
            }
            else
            {
                myList.add(myHeap.peek());
            }
        }
        for(int i=A;i<B.length;i++)
        {
            if(myHeap.peek()<B[i])
            {
                myHeap.poll();
                myHeap.add(B[i]);
            }
            myList.add(myHeap.peek());
        }
        System.out.println(myList);
    }

}
