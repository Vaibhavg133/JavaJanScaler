package com.company.LinkedList;

class LinkedListL
{
    int data;
    LinkedListL next;
    LinkedListL(int d)
    {
        data=d;
        next = null;
    }
}


public class LL {
    public static void main(String[] args) {
        LinkedListL a = createList(10);
        printList(a);
        System.out.println();
        a=insertAtHead(a,10);
        printList(a);
        a=insertAt(a,11,5);
        System.out.println();
        printList(a);
    }
    public static LinkedListL createList(int N)
    {
        LinkedListL head = new LinkedListL(N-N+1);
        LinkedListL tail = head;
        for(int i=2;i<=N;i++)
        {
            tail.next=new LinkedListL(i);
            tail = tail.next;
        }
        return head;
    }
    public static void printList(LinkedListL head)
    {
        LinkedListL temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.print("null");
    }
    public static LinkedListL insertAtHead(LinkedListL head, int data)
    {
        LinkedListL temp = head;
        LinkedListL L1 = new LinkedListL(data);
        L1.next=head;
        head=L1;
        return L1;
    }
    public static LinkedListL insertAt(LinkedListL head, int data, int pos)
    {
        if(pos==0)
        {
            insertAtHead(head,data);
        }
        LinkedListL L = new LinkedListL(data);
        LinkedListL temp = head;
        for(int i=1;i<pos;i++)
        {
            temp =temp.next;
        }
        L.next=temp.next;
        temp.next=L;
        return head;
    }

    public static LinkedListL removeAt(LinkedListL head, int pos)
    {
        return head;
    }
}
