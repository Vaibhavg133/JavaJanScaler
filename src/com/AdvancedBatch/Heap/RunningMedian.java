package com.AdvancedBatch.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
    public static void main(String[] args) {
        int[] A = {59,64,10,39};
        function(A);
        ArrayList<Integer> subs = new ArrayList<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i : A)
        {
            subs.add(i);
            Collections.sort(subs);
            if(subs.size()%2==0)
            {
                int ele = subs.size()/2;
                myList.add(subs.get(ele-1));
            }
            else
            {

                int ele = subs.size()/2;
                if(ele==0)
                {
                    myList.add(subs.get(ele));
                }
                else
                {

                    myList.add(subs.get(ele));
                }

//                myList.add(subs.get(ele));
            }
        }
        System.out.println(myList);
    }
    public static void function(int[] A)
    {
        PriorityQueue<Integer> myQ = new PriorityQueue<>();
        for(int i : A)
        {
            myQ.add(i);
        }
        System.out.println(myQ);
    }

}
