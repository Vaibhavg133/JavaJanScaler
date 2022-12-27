package com.AdvancedBatch.Queue;

import java.util.Stack;

public class mainClass {
    public static void main(String[] args) {
        queue myQueue=new queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.printQueue();
        System.out.println();
        queue myQ = reverseMyQueue(myQueue);
        myQ.printQueue();
        System.out.println();
//        System.out.println(myQueue.getSize());
//        System.out.println(myQueue.getFront());
//        System.out.println(myQueue.getLast());
//        myQueue.dequeue();
//        myQueue.printQueue();
//        System.out.println();
//        System.out.println(myQueue.getSize());
//        System.out.println(myQueue.getFront());
//        System.out.println(myQueue.getLast());
//        myQueue.dequeue();
//        System.out.println(myQueue.isEmpty());
//        myQueue.dequeue();
//        System.out.println(myQueue.isEmpty());
    }
    public static queue reverseMyQueue(queue myQueue)
    {
        Stack<Integer> myStack=new Stack<>();
        while(!myQueue.isEmpty())
        {
            myStack.push(myQueue.getFront());
            myQueue.dequeue();
        }
        queue myQ = new queue();
        while(!myStack.isEmpty())
        {
            int number= myStack.pop();
            myQ.enqueue(number);
        }
        //myQ.printQueue();
        return myQ;
    }

}
