package com.AdvancedBatch.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class minStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(-2);
        int min = myStack.getMin();
        System.out.println(min);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.getSize());
        myStack.pop();
        min = myStack.getMin();
        System.out.println(min);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.getSize());
        myStack.pop();
        min = myStack.getMin();
        System.out.println(min);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.getSize());
        myStack.pop();
        min = myStack.getMin();
        System.out.println(min);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.getSize());
    }

}
class LLL
{
    int data;
    LLL next;
    LLL(int data)
    {
        this.data=data;
        next=null;
    }
}
class Stack
{
    LLL head;
    //int size;
    Stack()
    {
        head=null;
        //size=0;
    }
    void push(int data)
    {
        LLL myNode = new LLL(data);
        if(head==null)
        {
            head=myNode;
        }
        else
        {
            LLL current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=myNode;
            //head.next=myNode;
        }
        //size++;
    }
    void pop()
    {
        if(head==null)
        {
            return;
        }
        else
        {
            head=head.next;
        }
        if(head==null) {
            return;
        }
    }
    int getTop()
    {
        return head.data;
    }
    boolean isEmpty()
    {
        return getSize()==0;
    }
    int getSize()
    {
        int size=0;
        LLL current = head;
        while(current!=null)
        {
            current=current.next;
            size++;
        }
        return size;
    }
    public int getMin()
    {
        int min = Integer.MAX_VALUE;
        Queue<Integer> q = new LinkedList<>();
        LLL current=head;
        while(head!=null)
        {
            int getHead = head.data;
            q.add(getHead);
            min=Math.min(getHead,min);
            head=head.next;
        }
        while(!q.isEmpty())
        {
            push(q.peek());
            q.poll();
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }


}


