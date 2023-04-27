package com.AdvancedBatch.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BSTNodeinRange {
    public static void main(String[] args) {
        BST root = new BST(15);
        root.left=new BST(12);
        root.left.left=new BST(10);
        root.left.right=new BST(14);
        root.left.left.left=new BST(8);
        root.right=new BST(20);
        root.right.left=new BST(16);
        root.right.right=new BST(27);
        System.out.println(countNode(root,12,20));
    }
    public static int countNode(BST root, int B, int C)
    {
        int count=0;
        if(root==null)
        {
            return count;
        }
        Queue<BST> myQ = new LinkedList<>();
        myQ.add(root);
        while(myQ.isEmpty()==false)
        {
            BST myNode = myQ.poll();
            if(myNode.data>=B && myNode.data<=C)
            {
                count++;
            }
            if(myNode.left!=null)
            {
                myQ.add(myNode.left);
            }
            if(myNode.right!=null)
            {
                myQ.add(myNode.right);
            }
        }
        return count;
    }

}
class BST
{
    int data;
    BST left;
    BST right;
    public BST(int data)
    {
        this.data=data;
        left=right=null;
    }

}

