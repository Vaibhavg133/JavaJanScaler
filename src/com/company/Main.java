package com.company;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Noddy root = new Noddy(1);
        root.left=new Noddy(2);
        root.right=new Noddy(3);
        root.left.left=new Noddy(4);
        root.left.right=new Noddy(5);
        root.right.left=new Noddy(6);
        root.right.right=new Noddy(7);
        root.left.left.right=new Noddy(8);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);

    }
    public static void postOrder(Noddy root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void preOrder(Noddy root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Noddy root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

}
class Noddy
{
    int data;
    Noddy left;
    Noddy right;
    Noddy(int d)
    {
        data=d;
        left=right=null;
    }
}

