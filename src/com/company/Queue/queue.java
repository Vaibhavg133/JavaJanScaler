package com.company.Queue;

public class queue {
    int[] arr;
    int front;
    int rear;
    int cs;
    int maxSize;

    queue(int defaultSize)
    {
        maxSize=defaultSize;
        arr = new int[defaultSize];
        front=0;
        rear=0;
    }
    boolean isQueueEmpty()
    {
        return cs==0;
    }
    boolean isQueueFull()
    {
        return cs==maxSize;
    }
    void push(int x)
    {
        if(!isQueueFull())
        {
            arr[rear]=x;
            rear=(rear+1)%maxSize;
            cs=cs+1;
        }
        else
        {
            System.out.println("Queue is full, unable to push");
        }
    }
    void pop()
    {
        if(!isQueueEmpty())
        {
            front=(front+1)%maxSize;
            cs=cs-1;
        }
    }
    int getFront()
    {
        if(!isQueueEmpty())
        {
            return arr[front];
        }
        return -1;
    }
    void printQueue()
    {
        if(!isQueueEmpty())
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+"->");
            }
            System.out.print("end");
        }
        else
        {
            System.out.println("Empty Queue");
        }
    }

}
