package com.AdvancedBatch.Stacks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class minSum {
    public static void main(String[] args) {
        int[] A = {2,9,7,8,3,4,6,1};//{4,7,3,8};//{2,9,7,8,3,4,6,1};//{4,2,1,5,6,3,2,4,2};//{3,2,4,1,5,2};//{2,9,7,8,3,4,6,1};//{3,1,2,4};
        //Integer[] res = (Integer[]) NS(A);
        //System.out.println(solve(A));
       // System.out.println();
        //ArrayList<Integer> res = PS(A);
        //for(int i : res)
        //{
         //   System.out.print(i+" ");
       // }
        ArrayList<Integer> ps = psMaker(A);
        for(int i : ps)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayList<Integer> ns = nsMaker(A);
        for(int i : ns)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayList<Integer> nsbf = nsMakerBF(A);
        for(int i : nsbf)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> psMaker(int[] A)
    {
        ArrayList<Integer> myList = new ArrayList<>();
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<A.length;i++)
        {
            while(!myStack.isEmpty() && myStack.peek()>A[i])
            {
                myStack.pop();
            }
            if(myStack.isEmpty())
            {
                myList.add(-1);
            }
            else
            {
                myList.add(myStack.peek());
            }
            myStack.push(A[i]);
        }
        return myList;
    }
    public static ArrayList<Integer> nsMaker(int[] A)
    {
        Stack<Integer> myStack = new Stack<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i=A.length-1;i>=0;i--)
        {
            while(!myStack.isEmpty() && myStack.peek()>A[i])
            {
                myStack.pop();
            }
            if(myStack.isEmpty())
            {
                myList.add(-1);
            }
            else
            {
                myList.add(myStack.peek());
            }
            myStack.push(A[i]);
        }
        Collections.reverse(myList);
        return myList;
    }
    public static ArrayList<Integer> nsMakerBF(int[] A)
    {
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            int flag=0;
            for(int j=i+1;j<A.length;j++)
            {
                if(A[j]<A[i])
                {
                    myList.add(A[j]);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                myList.add(-1);
            }
        }
        return myList;
    }





}
