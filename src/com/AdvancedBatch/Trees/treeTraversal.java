package com.AdvancedBatch.Trees;

public class treeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.left.left=new Node(9);
        root.left.right=new Node(5);
        root.left.left.right=new Node(10);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.left.left=new Node(8);
        root.right.right=new Node(7);
//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//
        printAllLevel(root);
    }
    public static void printKLevel(Node root,int K)
    {
        if(root==null)
        {
            return;
        }
        if(K==0)
        {
            System.out.print(root.data);
        }
        printKLevel(root.left,K-1);
        printKLevel(root.right,K-1);
    }
    public static void printAllLevel(Node root)
    {
        for(int i=0;i<height(root);i++)
        {
            printKLevel(root,i);
            System.out.println();
        }
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int h1=height(root.left);
        int h2=height(root.right);
        return Math.max(h1,h2)+1;
    }



    public static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


}
class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}

