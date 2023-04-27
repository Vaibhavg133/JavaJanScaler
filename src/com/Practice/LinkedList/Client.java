package com.Practice.LinkedList;

import java.util.HashSet;

public class Client {

    public static void main(String[] args) {
        LinkedList root= new LinkedList(10);
        //printList(root);
        root=addNode(root,20);
        root=addNode(root,30);
        root=addNode(root,40);
        root=addNode(root,40);
        System.out.println();
        printList(root);
        removeDuplicates(root);
        //root=insertLast(root,);
        //root=removeAt(root,);
        System.out.println();
        printList(root);
        System.out.println();
        System.out.println(sizeOfList(root));

    }
    public static void removeDuplicates(LinkedList root)
    {
        HashSet<Integer> set = new HashSet<>();
        LinkedList current=root;
        for(int i=1;i<sizeOfList(root);i++)
        {
            if(set.contains(current.data))
            {
                removeAt(root,i);
            }
            else
            {
                set.add(current.data);
            }
            current=current.next;
        }
    }

    public static LinkedList insertAt(LinkedList root, int data, int index)
    {
        if(root!=null)
        {
            if(index<=0)
            {
                return insertHead(root,data);
            }
            else if(index>=sizeOfList(root))
            {
                return insertLast(root,data);
            }
            else
            {
                LinkedList myElement = new LinkedList(data);
                LinkedList current =root;
                for(int i=1;i<index-1;i++)
                {
                    current=current.next;
                }
                myElement.next=current.next;
                current.next=myElement;
                return root;
            }

        }
        return null;
    }

    public static LinkedList insertHead(LinkedList root, int data)
    {
        if(root==null)
        {
            return new LinkedList(data);
        }
        else
        {
            LinkedList head=new LinkedList(data);
            head.next=root;
            return head;
        }
    }
    public static LinkedList insertLast(LinkedList root, int data)
    {
        if(root==null)
        {
            return new LinkedList(data);
        }
        else
        {
            LinkedList current = root;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=new LinkedList(data);
            return root;
        }
    }


    public static int getElementAt(LinkedList root, int index)
    {
        if(root!=null)
        {
            if(index<=0)
            {
                return getFirstElement(root);
            }
            else if(index>=sizeOfList(root))
            {
                return getLast(root);
            }
            else
            {
                LinkedList temp = root;
                for(int i=1;i<index;i++)
                {
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        return Integer.MIN_VALUE;
    }
    public static int getFirstElement(LinkedList root)
    {
        if(root!=null)
        {
            return root.data;
        }
        return Integer.MIN_VALUE;
    }
    public static int getLast(LinkedList root)
    {
        if(root!=null)
        {
            LinkedList test = root;
            while(test.next!=null)
            {
                test=test.next;
            }
            return test.data;
        }
        return Integer.MIN_VALUE;
    }

    public static void removeAt(LinkedList root, int index)
    {
        if(root!=null)
        {
            if(index<=0)
            {
                removeHead(root);
            }
            else if(index>=sizeOfList(root))
            {
                removeLast(root);
            }
            else
            {
                LinkedList current = root;
                for(int i=1;i<index-1;i++)
                {
                    current=current.next;
                }
                if(current.next!=null)
                {
                    if(current.next.next!=null)
                    {
                        current.next=current.next.next;
                    }
                }
            }
        }

    }


    public static void removeHead(LinkedList root)
    {
        if(root!=null)
        {
            root=root.next;
        }

    }
    public static void removeLast(LinkedList root)
    {
        if(root!=null)
        {
            LinkedList temp = root;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            LinkedList lastNode = temp.next;
            temp.next=null;
            lastNode=null;
        }
    }


    public static int sizeOfList(LinkedList root)
    {
        int size=0;
        LinkedList temp = root;
        while(temp!=null)
        {
            size++;
            temp=temp.next;

        }
        return size;
    }

    public static LinkedList addNode(LinkedList root, int data)
    {
        if(root==null)
        {
            root= new LinkedList(data);

        }
        else
        {
            LinkedList temp = root;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new LinkedList(data);

        }
        return root;
    }
    public static void printList(LinkedList root)
    {
        if(root==null)
        {
            System.out.println("Blank");
        }
        else
        {
            LinkedList temp = root;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }

}
