package com.AdvancedBatch.Trees;

import java.util.*;

public class levelOrder {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(6);
//        ArrayList<ArrayList<Integer>> res = printLevel(root);
//        for(int i=0;i<res.size();i++)
//        {
//            for(int j=0;j<res.get(i).size();j++)
//            {
//                System.out.print(res.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        int[] A = {1,2,3,4,5,-1,-1,-1,-1,-1,-1};
        ArrayList<Integer> res2 = arrayToList(A);
        Node root2 = deserializeBinaryTree(res2);
        ArrayList<ArrayList<Integer>> myRes = printLevel(root2);
        for(int i=0;i<myRes.size();i++)
        {
            for(int j=0;j<myRes.get(i).size();j++)
            {
                System.out.print(myRes.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> arrayToList(int[] A)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : A)
        {
            res.add(i);
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> printLevel(Node root)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> myRes = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                Node current = q.poll();
                myRes.add(current.data);
                if(current.left!=null)
                {
                    q.add(current.left);
                }
                if(current.right!=null)
                {
                    q.add(current.right);
                }
            }
            result.add(myRes);
        }
        return result;
    }
    public static Node deserializeBinaryTree(ArrayList<Integer> A)
    {
        Node root = new Node(A.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty())
        {
            Node current = q.poll();
            if(current==null)
            {
                continue;
            }
            int leftVal = A.get(i);
            int rightVal = A.get(i+1);
            i+=2;
            if(leftVal==-1)
            {
                current.left=null;
            }
            else
            {
                current.left=new Node(leftVal);
            }
            if(rightVal==-1)
            {
                current.right=null;
            }
            else
            {
                current.right=new Node(rightVal);
            }
            q.add(current.left);
            q.add(current.right);
        }
        return root;
    }


}
