package com.AdvancedBatch.Trees;

import java.util.LinkedList;
import java.util.Queue;


public class invertBT {
    public static void main(String[] args) {
        MyTreeNode root = new MyTreeNode(1);
        root.left=new MyTreeNode(2);
        root.right=new MyTreeNode(3);
        root.left.left=new MyTreeNode(4);
        root.left.right=new MyTreeNode(5);
        root.right.left=new MyTreeNode(6);
        root.right.right=new MyTreeNode(7);
        levelOrder(root);
        MyTreeNode root2=invertBT(root);
        System.out.println();
        levelOrder(root2);
    }
    public static MyTreeNode invertBT(MyTreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        Queue<MyTreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty())
        {
            MyTreeNode current = myQueue.poll();
            if(current==null)
            {
                continue;
            }
            else
            {
                mySwap(current);
                if(current.left!=null)
                {
                    myQueue.add(current.left);
                }
                if(current.right!=null)
                {
                    myQueue.add(current.right);
                }
            }
        }
        return root;
    }
    public static void mySwap(MyTreeNode root)
    {
        if(root==null)
        {
            return;
        }
        MyTreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
    }


    public static void levelOrder(MyTreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Queue<MyTreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);
        while(!myQueue.isEmpty())
        {
            MyTreeNode myNode = myQueue.poll();
            if(myNode==null)
            {
                System.out.println();
                if(!myQueue.isEmpty())
                {
                    myQueue.add(null);
                }
            }
            else
            {
                System.out.print(myNode.data+" ");
                if(myNode.left!=null)
                {
                    myQueue.add(myNode.left);
                }
                if(myNode.right!=null)
                {
                    myQueue.add(myNode.right);
                }
            }
        }
    }

}
class MyTreeNode
{
    int data;
    MyTreeNode left;
    MyTreeNode right;
    MyTreeNode(int d)
    {
        data=d;
        left=right=null;
    }
}

