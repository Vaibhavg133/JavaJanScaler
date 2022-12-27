package com.AdvancedBatch.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] A = {4,5,2,10,8};
        ArrayList<Integer> myList=bruteForce(A);
        for(int i:myList)
        {
            System.out.print(i+" ");
        }
        ArrayList<Integer> myList2 = optimized(A);
        System.out.println();
        for(int i:myList2)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> optimized(int[] A)
    {
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<A.length;i++)
        {
            myStack.push(A[i]);
        }
        Stack<Integer> finalStack = new Stack<>();
        int counter=0;
        while(myStack.size()!=1)
        {
            int number = myStack.pop();
            int flag = 0;
            for(int j=A.length-counter-1;j>=0;j--)
            {
                if(A[j]<number)
                {
                    counter++;
                    flag=1;
                    finalStack.push(A[j]);
                    break;
                }
            }
            if(flag==0)
            {
                finalStack.push(-1);counter++;
            }
        }
        finalStack.push(-1);
        ArrayList<Integer> result=new ArrayList<>();
        while(!finalStack.isEmpty())
        {
            int number=finalStack.pop();
            result.add(number);
        }
        return result;
    }

    public static ArrayList<Integer> bruteForce(int[] A)
    {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        for(int i=1;i<A.length;i++)
        {
            int flag=0;
            int number=A[i];
            for(int j=i;j>=0;j--)
            {
                if(A[j]<number)
                {
                    result.add(A[j]);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                result.add(-1);
            }
        }
        return result;
    }

}
