package com.AdvancedBatch.LinkedList;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        Node root = new Node(10);
        addList(root,20);
        addList(root,30);
        addList(root,40);
        addList(root,50);
        //addList(root,60);
        printList(root);
        System.out.println();
        int a = getKthElementinLL(root,3);
        System.out.println(a);
        //System.out.println(getKthElementinLL(root,3));
        //Node prev = revsereInPartS(root,2,4);
        //Node prev = reverse(root);
        //printList(prev);
        //getKthElementsinList(root,2);
        //System.out.println();
        //root=deleteMiddle(root);
        //printList(root);
        //getMiddleElement(root);
        //root=getMiddleElement(root);
        //printList(root);
    }
    public static int getKthElementinLL(Node root, int K)
    {
        if(root==null)
        {
            return -1;
        }
        Node current = root;
        for(int i=0;i<K;i++)
        {
            if(i==(K-1))
            {
                return current.data;
            }
            current=current.next;
        }
        return -1;
    }

    public static Node revsereInPartS(Node root,int B,int C)
    {
        if(B<=C)
        {
            Node currentNode=root;
            int count=1;
            while(count<B)
            {
                currentNode=currentNode.next;
                count++;
            }
            //currentNode will have the that node that start from B
            int prevCount=1;
            Node prevNode = root;
            while(prevCount<(B-1))
            {
                prevNode=prevNode.next;
                prevCount++;
            }
//            System.out.println(prevNode.data+" "+ currentNode.data);
            while(B<=C)
            {
                Node temp = currentNode.next;
                currentNode.next=prevNode;
                prevNode=currentNode;
                currentNode=temp;
                B++;
            }
            return root;
        }
        return root;
    }

    public static Node reverse(Node root)
    {
        Node current = root;
        Node prev = null;
        while(current!=null)
        {
            Node temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }


    public static Node reverseInParts(Node root, int B, int C)
    {
        if(B<=C)
        {
            int count=1;
            Node startNode = root;
            while(count<B)
            {
                startNode=startNode.next;
                count++;
            }
            Node currentNode=startNode;
            //int count2=
        }
        return root;
    }

    public static Node reverseMyLinkedList(Node root)
    {
        Node current = root;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void getKthElementsinList(Node root, int K)
    {
        int count=K+1;
        Node current = root;
        while(current!=null )//&& current.next!=null)
        {
            count--;
            current=current.next;
            if(count==0)
            {
                System.out.print(current.data+" ");
                count=K;
            }

        }
    }
    public static Node deleteMiddle(Node root)
    {
        if(root.next==null)
        {
            root=root.next;
            return root;
        }
        Node slow = root;
        Node fast = root;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next==null)
        {
            root.next=null;
            return root;
        }
        slow.data=slow.next.data;
        slow.next=slow.next.next;
        return root;
    }

    public static Node getMiddleElement(Node root)
    {
        Node fast = root;
        Node slow = root;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.data=slow.next.data;
        slow.next=slow.next.next;
        return root;
    }

    public static Node deleteFirst(Node root)
    {
        Node head=root;
        head=head.next;
        return head;
    }
    public static Node deleteNode(Node root, int count)
    {
        Node current = root;
        while(count!=0)
        {
            current=current.next;
        }
        Node prev=current.next.next;
        current.next=prev;
        return root;
    }


    public static void specificElement(Node root, int count)
    {
        Node current = root;
        while(count!=0)
        {
            current=current.next;
            count--;
        }
        System.out.println(current.data);
        //return current;
    }

    public static Node middleElementOptimized(Node root)
    {
        Node slow=root;
        Node fast=root;
        int count=0;
        while(fast!=null && fast.next!=null)
        {
            count++;
            slow=slow.next;
            fast=fast.next.next;
        }
        //System.out.println(count+1);
        //slow is the middle node
        //specificElement(root,count);
        //System.out.println(slow.data);
        return slow;
    }

    public static Node middleElement(Node root)
    {
        int len = ListLength(root);
        if(len%2!=0)
        {
            Node currentNode = root;
            int l = (len/2);
            while(l!=0)
            {
                currentNode=currentNode.next;
                l--;
            }
            return currentNode;
        }
        else
        {
            int l = (len/2)+1;
            Node currentNode = root;
            while(l!=1)
            {
                currentNode=currentNode.next;
                l--;
            }
            return currentNode;
        }
    }

    public static int ListLength(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        Node currentNode = root;
        while(currentNode!=null)
        {
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }

    public static Node addList(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        Node currentNode = root;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=new Node(data);
        return root;
    }
    public static void printList(Node root)
    {
        Node currentNode = root;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }


}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

