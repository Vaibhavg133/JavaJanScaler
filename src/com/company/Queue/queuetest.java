package com.company.Queue;

public class queuetest {
    public static void main(String[] args) {
        queue q = new queue(10);
        for(int i=0;i<10;i++)
        {
            q.push(i);
        }
        q.printQueue();
    }
}
