package com.AdvancedBatch.Stacks;

import java.util.Stack;

public class maxAreaRectangle {
    public static void main(String[] args) {
        int[] A = {2,1,5,6,2,3};
        System.out.println(maxAreaRectangle(A));
        //System.out.println(solveAreaBF(A));
    }
    public static int solveAreaBF(int[] A)
    {
        int max_area=0;
        for(int i=0;i<A.length;i++)
        {
            int H=A[i];
            int L=i,R=i;
            while(L>=0)
            {
                if(A[L]<H)
                {
                    break;
                }
                L=L-1;
            }
            while(R<A.length)
            {
                if(A[R]<H)
                {
                    break;
                }
                R=R+1;
            }
            max_area=Math.max(max_area,((R-L-1)*H));
        }
        return max_area%(1000000000+7);
    }
    public static int maxAreaRectangle(int[] A)
    {
        int max_area=0;
        int[] PS = previousSmaller(A);
        int[] NS = nextSmaller(A);
        for(int i=0;i<A.length;i++)
        {
            int current = (NS[i]-PS[i]-1)*A[i];
            max_area=Math.max(max_area,current);
        }
        return max_area;
    }
    public static int[] previousSmaller(int[] A)
    {
        int[] PS = new int[A.length];
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<A.length;i++)
        {
            while(!myStack.isEmpty() && A[myStack.peek()]>=A[i])
            {
                myStack.pop();
            }
            if(myStack.isEmpty())
            {
                PS[i]=-1;
            }
            else
            {
                PS[i]=myStack.peek();
            }
            myStack.push(i);
        }
        return PS;
    }
    public static int[] nextSmaller(int[] A)
    {
        int[] NS = new int[A.length];
        Stack<Integer> myStack = new Stack<>();
        for(int i=A.length-1;i>=0;i--)
        {
            while(!myStack.isEmpty() && A[myStack.peek()]>A[i])
            {
                myStack.pop();
            }
            if(myStack.isEmpty())
            {
                NS[i]=-1;
            }
            else
            {
                NS[i]=myStack.peek();
            }
            myStack.push(i);
        }
        for(int i=0;i<A.length;i++)
        {
            if(NS[i]==-1)
            {
                NS[i]=A.length;
            }
        }
        return NS;
    }


}
