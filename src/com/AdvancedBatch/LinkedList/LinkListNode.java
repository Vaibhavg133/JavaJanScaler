package com.AdvancedBatch.LinkedList;

import java.util.Stack;

public class LinkListNode {
    public static void main(String[] args) {
        Nodee masterNode = new Nodee(10);
        addNode(masterNode,20);
        addNode(masterNode,10);
        System.out.println(isPalindrome(masterNode));
        //printLL(masterNode);
    }
    public static int isPalindrome(Nodee root)
    {
        Nodee stackPtr = root;
        Stack<Integer> myStack = new Stack<>();
        while(stackPtr!=null)
        {
            myStack.push(stackPtr.data);
            stackPtr=stackPtr.next;
        }
        Nodee current=root;
        while(current!=null)
        {
            int i = myStack.pop();
            if(i!=current.data)
            {
                return 0;
            }
            current=current.next;
        }
        return 1;
    }

    public static void printLL(Nodee root)
    {
        Nodee current=root;
        while(current.next!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void addNode(Nodee root,int data)
    {
        if(root==null)
        {
            Nodee node = new Nodee(data);
            root.next=node;
        }
        else
        {
            Nodee current=root;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=new Nodee(data);
        }

    }

}
class Nodee
{
    int data;
    Nodee next;
    Nodee(int data)
    {
        this.data=data;
        this.next=null;
    }

}
