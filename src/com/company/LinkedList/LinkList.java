package com.company.LinkedList;

class Nodd
{
    int data;
    Nodd next;
    Nodd(int data)
    {
        this.data=data;
        next=null;
    }
    Nodd createList(int N)
    {
        Nodd head = new Nodd(N-N+1);
        Nodd tail = head;
        for(int i=2;i<=N;i++)
        {
            tail.next=new Nodd(i);
            tail = tail.next;
        }
        return head;
    }
    void printList(Nodd head)
    {
        Nodd tail = head;
        while(tail!=null)
        {
            System.out.print(tail.data+"->");
            tail=tail.next;
        }
        System.out.print("null");
    }
    Nodd insertAtHead(Nodd head,int data)
    {
        Nodd temp = new Nodd(data);
        temp.next=head;
        head=temp;
        return head;
    }
    Nodd insertAt(Nodd head, int pos, int data)
    {
        Nodd abk = new Nodd(data);
        Nodd tail = head;
        for(int i=1;i<pos;i++)
        {
            tail = tail.next;
        }
        abk.next=tail.next;
        tail.next=abk;
        return head;
    }
}

public class LinkList {
    public static void main(String[] args) {
        
    }
    public static Nodd creatList(int N)
    {
        Nodd head = new Nodd(N-N+1);
        Nodd tail = head;
        for(int i=2;i<=N;i++)
        {
            tail.next=new Nodd(i);
            tail = tail.next;
        }
        return head;
    }
    public static void printList(Nodd head)
    {
        Nodd tail = head;
        while(tail!=null)
        {
            System.out.print(tail.data+"->");
            tail = tail.next;
        }
        System.out.print("null");
    }
    public static Nodd insertAtHead(Nodd head,int data)
    {
        Nodd a = new Nodd(data);
        a.next=head;
        head=a;
        return head;
    }
    public static Nodd insertAt(Nodd head,int pos,int data)
    {
        Nodd a = new Nodd(data);
        Nodd tail = head;
        for(int i=1;i<pos;i++)
        {
            tail = tail.next;
        }
        a.next=tail.next;
        tail.next=a;
        return head;
    }
}
