package com.AdvancedBatch.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bstBasic {
    public static void main(String[] args) {
//        int[] A = {3,3,8,7,2,6,0,9,4,5};
//        Node root = null;
//        for(int i : A)
//        {
//            root=insertInBST(root,i);
//        }
//        //levelOrder(root);
////        System.out.println(searchBST(root,3));
////        System.out.println(searchBSTiterative(root,3));
//        Node testNode = new Node(5);
//        testNode.left=new Node(3);
//        testNode.right=new Node(8);
//        testNode.left.left=new Node(2);
//        testNode.left.right=new Node(4);
//        testNode.left.left.left=new Node(0);
//        testNode.right.left=new Node(7);
//        testNode.right.right=new Node(9);
//        testNode.right.left.left=new Node(6);
//        //inOrder(testNode);
//
//        Node testNode2 = new Node(15);
//        testNode2.left=new Node(9);
//        testNode2.left.left=new Node(4);
//        testNode2.left.right=new Node(13);
//        testNode2.left.right.left=new Node(10);
//        testNode2.right=new Node(20);
//        testNode2.right.right=new Node(24);
//        testNode2.right.right.left=new Node(22);
//        testNode2.right.right.right=new Node(29);
//        System.out.println();
//        //inOrder(testNode2);
//        int[] AA = {1,2,4,8,9,10,20,30};
//        Node testNode3 = createBST(AA,0,AA.length-1);
//        //inOrder(testNode3);
//        //levelOrder(testNode3);
//        //int[] a = {1,2,3,4,5,6,7};
//        //Node testRoot4 = createBST(a,0,a.length-1);
//        //System.out.println(isBST(testRoot4,Integer.MAX_VALUE,Integer.MIN_VALUE));
//        levelOrder(root);
//        System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        //int[] A = {4,9,10,13,15,20,22,24,29};
        //Node myRoot = createBST(A,0,A.length-1);
        //levelOrder(myRoot);
        //inOrder(myRoot);
        Node root = new Node(15);
        root.left = new Node(9);
        root.left.left = new Node(4);
        root.left.right = new Node(13);
        root.left.right.left = new Node(10);
        root.right=new Node(20);
        root.right.right=new Node(24);
        root.right.right.left=new Node(22);
        root.right.right.right = new Node(29);
        //System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        ArrayList<Integer> test = getPath(root,22);//getPathToNode(root,8);
        for(int i : test)
        {
            System.out.print(i+" ");
        }
    }

    public static Boolean isPresent(Node root, int K)
    {
        Boolean res = false;
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty())
        {
            Node myNode = myQueue.poll();
            if(myNode.data==K)
            {
                res=true;
                break;
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
        return res;
    }
    public static ArrayList<Integer> getPathToNode(Node root, int Key)
    {
        ArrayList<Integer> myRes = new ArrayList<>();
        if(root==null)
        {
            return myRes;
        }
        if(isPresent(root,Key))
        {
            Queue<Node> myQueue = new LinkedList<>();
            myQueue.add(root);
            while(!myQueue.isEmpty())
            {
                Node myNode = myQueue.poll();
                if(myNode.left==null && myNode.right==null && myNode.data!=Key)
                {
                    myRes.add(-1);
                    break;
                }
                if(myNode.data==Key)
                {
                    myRes.add(myNode.data);
                }
                else if(Key>myNode.data)
                {
                    myQueue.add(myNode.right);
                    myRes.add(myNode.data);
                }
                else if(Key<myNode.data)
                {
                    myQueue.add(myNode.left);
                    myRes.add(myNode.data);
                }
            }
            if(myRes.contains(-1))
            {
                return null;
            }
            return myRes;
        }
        else
        {
            ArrayList<Integer> myList = new ArrayList<>();
            return myList;
        }
    }
    public static ArrayList<Integer> getPath(Node root,int Key)
    {
        ArrayList<Integer> myRes = new ArrayList<>();
        if(root==null)
        {
            return myRes;
        }
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty())
        {
            Node myNode = myQueue.poll();
            if(myNode.left==null && myNode.right==null && myNode.data!=Key)
            {
                myRes.add(-1);
                break;
            }
            if(myNode.data==Key)
            {
                myRes.add(myNode.data);
            }
            else if(Key>myNode.data)
            {
                myQueue.add(myNode.right);
                myRes.add(myNode.data);
            }
            else if(Key<myNode.data)
            {
                myQueue.add(myNode.left);
                myRes.add(myNode.data);
            }
        }
        if(myRes.contains(-1))
        {
            ArrayList<Integer> blank =  new ArrayList<>();
            return blank;
        }
        return myRes;
    }

    public static Boolean isBST(Node root,int min, int max)
    {
       if(root==null)
       {
           return true;
       }
       if(root.data<min || root.data>max)
       {
           return false;
       }
       return isBST(root.left,min,root.data-1) && isBST(root.right, root.data+1,max);
    }

    public static Node createBST(int[] A, int s, int e)
    {
        if(s<=e)
        {
            int mid = (s+e)/2;
            Node root = new Node(A[mid]);
            root.left=createBST(A,s,mid-1);
            root.right=createBST(A,mid+1,e);
            return root;
        }
        return null;
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

    public static Boolean searchBSTiterative(Node root, int K)
    {
        while(root!=null)
        {
            if(K==root.data)
            {
                return true;
            }
            else if(K<=root.data)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return false;
    }

    public static Boolean searchBST(Node root, int K)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==K)
        {
            return true;
        }
        else if(K<=root.data)
        {
            return searchBST(root.left,K);
        }
        else
        {
            return searchBST(root.right,K);
        }
    }
    public static Node insertInBST(Node root, int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<=root.data)
        {
            root.left=insertInBST(root.left,data);
        }
        else
        {
            root.right=insertInBST(root.right,data);
        }
        return root;
    }
    public static void levelOrder(Node root)
    {
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);
        while(!myQueue.isEmpty())
        {
            Node myNode = myQueue.poll();
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
class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        this.data=d;
        left=right=null;
    }

}

