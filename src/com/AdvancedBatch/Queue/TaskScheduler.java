package com.AdvancedBatch.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            B[i]=sc.nextInt();
        }
        int solve=solve(A,B);
        System.out.println(solve);

    }
    public static int solve(int[] A,int[] B)
    {
        int count=0;
        if(A.length!=B.length)
        {
            return 0;
        }
        Queue<Integer> currentState = new LinkedList<Integer>();
        Queue<Integer> desiredState = new LinkedList<Integer>();
        for(int i=0;i<A.length;i++)
        {
            currentState.add(A[i]);
        }
        for(int i=0;i<B.length;i++)
        {
            desiredState.add(B[i]);
        }
        while(desiredState.size()!=0)
        {
            int elem = desiredState.peek();
            int counter=0;
            while(true)
            {
                int elem2=currentState.peek();
                if(elem2==elem)
                {
                    //pop;
                    currentState.poll();
                    desiredState.poll();
                    count++;
                    break;
                }
                else
                {
                    currentState.poll();
                    currentState.add(elem2);
                    count++;
                }
                if(counter==currentState.size())
                {
                    break;
                }
                counter++;
            }
        }
        return count;
    }

}
