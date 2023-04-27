package com.AdvancedBatch.LinkedList;

public class DesignLinkedList {
    public static void main(String[] args) {
        int[][] A = {{0,1,-1},
                     {1,2,-1},
                     {2,3,1},
                     {3,1,-1}};



        LLNode root = new LLNode(10);
        printList(root);
        System.out.println();
        root = appendLast(root,20);
        printList(root);
        System.out.println();
        root=appendLast(root,30);
        printList(root);
        root=appendLast(root,40);
        System.out.println();
        printList(root);
        System.out.println();
        root = addi_1idx(root,3,11);
        //System.out.println();
        printList(root);
        System.out.println();
        root= addi_1idx(root,2,12);
        printList(root);
        System.out.println();
        deleteNode(root,3);
        printList(root);
        System.out.println(getSize(root));
    }
    public static int getSize(LLNode root)
    {
        int size=0;
        while(root!=null)
        {
            root=root.next;
            size++;
        }
        return size;
    }

    public static void deleteNode(LLNode root, int idx)
    {
        if(idx<getSize(root))
        {
            if(idx==0)
            {
                root=root.next;
            }
            else
            {
                int i = 0;
                LLNode temp = root;
                while(idx-2!=i)
                {
                    i++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }

    }

    public static LLNode addi_1idx(LLNode root, int idx, int data)
    {
        int i = 0;
        LLNode temp = root;
        while(i!=idx-2)
        {
            i++;
            temp=temp.next;
        }
        LLNode temp3 = temp.next;
        LLNode temp2 = temp;
        temp2.next=null;
        temp2.next = new LLNode(data);
        temp2.next.next=temp3;
        return root;
    }
    public static void printList(LLNode root)
    {
        LLNode temp = root;
        while(root!=null)
        {
            System.out.print(root.data+"->");
            root=root.next;
        }
        System.out.print("null");
    }

    public static LLNode appendLast(LLNode root, int data)
    {
        if(root==null)
        {
            return new LLNode(data);
        }
        LLNode temp = root;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new LLNode(data);
        return root;
    }

    public static LLNode addHead(LLNode root, int data)
    {
        LLNode res = new LLNode(data);
        if(root==null)
        {
            return res;
        }
        else
        {
            res.next=root;
            return res;
        }
    }

}

class LLNode
{
    int data;
    LLNode next;
    LLNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}

