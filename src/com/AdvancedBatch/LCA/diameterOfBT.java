package com.AdvancedBatch.LCA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class diameterOfBT {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.left.left=new Node(-1);
        root.left.left.right=new Node(-1);
        root.left.right=new Node(5);
        root.left.right.left=new Node(-1);
        root.left.right.right=new Node(-1);
        root.right.right=new Node(6);
        root.right.right.left=new Node(-1);
        root.right.right.right=new Node(-1);
//        ArrayList<Integer> res = getLeafs(root);
//        for(int i : res)
//        {
//            System.out.print(i+" ");
//        }
        int size = find(root);//mainFunction(root);
        System.out.println(size);
    }
    public static int heightOfTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int LH = heightOfTree(root.left);
        int RH = heightOfTree(root.right);
        return 1+Math.max(LH,RH);
    }
    public static int find(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        int max = Integer.MIN_VALUE;
        while(myQueue.isEmpty()==false)
        {
            Node myNode = myQueue.poll();
            if(myNode.left==null && myNode.right==null)
            {
                continue;
            }
            if(myNode.left.data!=-1 && myNode.right.data!=-1)
            {
                int LH = heightOfTree(myNode.left);
                int RH = heightOfTree(myNode.right);
                max = Math.max(max,Math.max(LH,RH));
                max=max+2;
            }
            if(myNode.left.data!=-1)
            {
                myQueue.add(myNode.left);
            }
            if(myNode.right.data!=-1)
            {
                myQueue.add(myNode.right);
            }

        }
        return max;
    }

    public static ArrayList<Integer> getLeafs(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty())
        {
            Node myNode = myQueue.poll();
            if(myNode.left==null && myNode.right==null)
            {
                result.add(myNode.data);
            }
            if(myNode.left!=null)
            {
                myQueue.add(myNode.left);
            }
            if(myNode.right!=null)
            {
                myQueue.add(myNode.right);
            }
        }
        return result;
    }
    public static int mainFunction(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int LH = getSize(root.left);
        int RH = getSize(root.right);
        return LH+RH;
    }
    public static int getSize(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int size = Integer.MIN_VALUE;
        ArrayList<Integer> leafs = getLeafs(root);
        for(int i=0;i<leafs.size();i++)
        {
            ArrayList<Integer> pathToLeaf=getPathToLeaf(root,leafs.get(i));
            size=Math.max(size,pathToLeaf.size());
        }
        return size;
    }
    public static ArrayList<Integer> getPathToLeaf(Node root, int Key)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty())
        {
            Node myNode = myQueue.poll();
            if(myNode.left==null && myNode.right==null && myNode.data!=Key)
            {
                result.add(-1);
                break;
            }
            if(myNode.data==Key)
            {
                result.add(myNode.data);
                break;
            }
            if(Key>myNode.data)
            {
                myQueue.add(myNode.right);
                result.add(myNode.data);
            }
            else if(Key< myNode.data)
            {
                myQueue.add(myNode.left);
                result.add(myNode.data);
            }
        }
        if(result.contains(-1))
        {
            ArrayList<Integer> blanks = new ArrayList<>();
            return blanks;
        }
        return result;
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
        left=null;
        right=null;
    }
}

