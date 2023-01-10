package com.AdvancedBatch.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class myTree {
    public static void main(String[] args) {
        TreeNodee root3 = new TreeNodee(1);
        root3.left = new TreeNodee(2);
        root3.right = new TreeNodee(3);
        root3.left.left = new TreeNodee(4);
        root3.left.right = new TreeNodee(5);
        root3.left.left.left = new TreeNodee(8);
        root3.right.left = new TreeNodee(6);
        root3.right.right = new TreeNodee(7);
        TreeNodee root = new TreeNodee(9);
        root.left=new TreeNodee(6);
        root.right=new TreeNodee(4);
        root.left.left=new TreeNodee(2);
        root.left.right=new TreeNodee(3);
        root.right.left=new TreeNodee(8);
        root.right.right=new TreeNodee(1);
        root.left.left.left=new TreeNodee(-7);
        root.left.left.right=new TreeNodee(11);
        root.left.right.left=new TreeNodee(15);
        root.right.right.left=new TreeNodee(12);
        root.left.left.left.right=new TreeNodee(14);
        root.left.right.left.right=new TreeNodee(19);
        TreeNodee root2 = new TreeNodee(1);
        root2.left=new TreeNodee(2);
        root2.right=new TreeNodee(3);
        root2.left.left=new TreeNodee(4);
        root2.left.right=new TreeNodee(5);
        root2.right.left=new TreeNodee(6);
        root2.right.right=new TreeNodee(7);
        //inOrder(root);
        //displayLevelOrder(root);
        //leftView(root);
        //rightView(root3);
        TopView(root2);
    }
    public static void inOrder(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static ArrayList<Integer> rightView(TreeNodee root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
        {
            return null;
        }
        Queue<TreeNodee> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);
        //System.out.println(root.data);
        result.add(root.data);
        while(!myQueue.isEmpty())
        {
            TreeNodee myNode = myQueue.poll();
            if(myNode==null)
            {
                if(myQueue.peek()!=null)
                {
                    result.add(myQueue.peek().data);
                    //System.out.println(myQueue.peek().data);
                }
                if(!myQueue.isEmpty())
                {
                    myQueue.add(null);
                }
            }
            else
            {
                if(myNode.right!=null)
                {
                    myQueue.add(myNode.right);
                }
                if(myNode.left!=null)
                {
                    myQueue.add(myNode.left);
                }
            }
        }
        return result;
    }


    public static void leftView(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        Queue<TreeNodee> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);
        System.out.println(root.data);
        while(!myQueue.isEmpty())
        {
            TreeNodee myNode = myQueue.poll();
            if(myNode==null)
            {
                if(myQueue.peek()!=null)
                {
                    System.out.println(myQueue.peek().data);
                }
                if(!myQueue.isEmpty())
                {
                    myQueue.add(null);
                }
            }
            else
            {
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

    public static void displayLevelOrder(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        Queue<TreeNodee> myQueue = new LinkedList<>();
        myQueue.add(root);
        myQueue.add(null);
        while(!myQueue.isEmpty())
        {
            TreeNodee myNode = myQueue.poll();
            if(myNode==null)
            {
                System.out.println();
                if(!myQueue.isEmpty())
                {
                    myQueue.add(null);
                    //continue;
                }
            }
            else
            {
                System.out.print(myNode.data);
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
    public static ArrayList<ArrayList<Integer>> verticalView(TreeNodee root)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null)
        {
            return null;
        }

        Queue<Pair> myQueue = new LinkedList<>();
        Pair p=new Pair(root,0);
        myQueue.add(p);
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        while(!myQueue.isEmpty())
        {
            Pair p1 = myQueue.peek();
            myQueue.poll();
            //map.getOrDefault(p1.distance).add(p1.myNode.data)
            //map.getOrDefault(p1.distance,new ArrayList<>().add(p1.myNode.data));
        }
        return result;
    }
    public static void TopView(TreeNodee root)
    {
        HashMap<Integer,TreeNodee> myMap = new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair f = q.poll();
            if(!myMap.containsKey(f.distance))
            {
                myMap.put(f.distance,f.myNode);
            }
            if(f.myNode.left!=null)
            {
                q.add(new Pair(f.myNode.left, f.distance-1));
            }
            if(f.myNode.right!=null)
            {
                q.add(new Pair(f.myNode.right,f.distance+1));
            }
        }
        for(int i=0;i<myMap.size();i++)
        {
            System.out.print(myMap.get(i).data+" ");
        }
    }

}
class TreeNodee
{
    int data;
    TreeNodee left;
    TreeNodee right;
    TreeNodee(int data)
    {
        this.data=data;
        this.left=this.right=null;
    }
}
class Pair
{
    TreeNodee myNode;
    int distance;
    Pair(TreeNodee m, int d)
    {
        myNode=m;
        distance=d;
    }

}

