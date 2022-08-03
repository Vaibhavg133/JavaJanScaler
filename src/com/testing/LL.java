package com.testing;

public class LL {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        a.next=b;
        //System.out.println(a.data+"->"+a.next.data);
        //printList(a);
        Node list1 = createList(10);
        printList(list1);
        Node insertHead = insertAt(list1,14,0);
        printList(insertHead);
        Node insertLast = insertAt(list1,100,2000);
        printList(insertLast);
        Node insertAt = insertAt(list1,1001,3);
        printList(insertAt);
        //System.out.println(a.data+" -> "+b.next);
        //System.out.println(a.data+" -> "+b.data);//.next);
    }
    public static int LinkedListLength(Node head)
    {
        Node tail = head;
        int count = 0;
        while(tail!=null)
        {
            count++;
            tail=tail.next;
        }
        return count;
    }

    public static Node insertAt(Node head,int data,int pos)
    {
        Node tail = head;
        Node yourNode = new Node(data);
        if(pos==0)
        {
            //insert At Beginning
            yourNode.next=head;
            return yourNode;

        }
        else if(pos>LinkedListLength(head))
        {
            //append last
            if(head==null)
            {
                head=yourNode;
                return head;
            }
            yourNode.next=null;
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=yourNode;
            return head;
        }
        else
        {
           //Node yourNode= new Node(data);
            for(int i=1;i<pos;i++)
            {
                tail =tail.next;
            }
            yourNode.next=tail.next;
            tail.next=yourNode;
            return head;
        }
    }

    public static void printList(Node head)
    {
        Node tail = head;
        while(tail!=null)
        {
            System.out.print(tail.data+" -> ");
            tail=tail.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static Node createList(int N)
    {
        Node head = new Node(N-N+1);
        Node tail = head;
        for(int i=2;i<=N;i++)
        {
            tail.next = new Node(i);
            tail= tail.next;
        }
        return head;
    }


}
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

