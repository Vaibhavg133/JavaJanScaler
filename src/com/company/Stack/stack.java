package com.company.Stack;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class stack {
    Node head;
    stack()
    {
        head=null;
    }

    void push(int data)
    {
        //insertAtHead
        if(head==null)
        {
            head=new Node(data);
        }
        else
        {
            Node n = new Node(data);
            n.next=head;
            head=n;
        }
    }
    void pop()
    {
        //removeAtHead
        if(head!=null)
        {
            head=head.next;
        }
    }
    int getTop()
    {
        //getHead
        return head.data;
    }
    boolean isEmpty()
    {
        return head==null;
    }
}
