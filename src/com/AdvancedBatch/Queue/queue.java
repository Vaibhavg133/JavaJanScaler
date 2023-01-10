package com.AdvancedBatch.Queue;

public class queue {
    Node head;
    Node tail;
    queue()
    {
        head=tail=null;
    }
    void enqueue(String data)
    {
        Node myNode = new Node(data);
        if(this.tail==null)
        {
            this.head=this.tail=myNode;
            return;
        }
        else
        {
            this.tail.next=myNode;
            this.tail=myNode;
        }
    }
    void dequeue()
    {
        if(this.head==null)
        {
            return;
        }
        Node temp = this.head;
        this.head=this.head.next;
        if(this.head==null)
        {
            this.tail=null;
        }
    }
    String getFront()
    {
        return this.head.data;
    }
    String getLast()
    {
        return this.tail.data;
    }
    int getSize()
    {
        int size=0;
        Node current = head;
        while(current!=null)
        {
            current=current.next;
            size++;
        }
        return size;
    }
    boolean isEmpty()
    {
        int size=getSize();
        return size==0;
    }
    void printQueue()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

}
class Node
{
    String data;
    Node next;
    Node(String data)
    {
        this.data=data;
        this.next=null;
    }
}

