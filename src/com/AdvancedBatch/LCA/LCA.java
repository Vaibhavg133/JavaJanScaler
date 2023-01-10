package com.AdvancedBatch.LCA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LCA {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        //int LCA = solve(root,4,5);
        //System.out.println(LCA);
        ArrayList<Integer> result = getPathToNode(root,7);
        for(int i : result)
        {
            System.out.print(i+" ");
        }
    }
    public static int solve(Node A, int B, int C)
    {
        if(A==null)
        {
            return 0;
        }
        ArrayList<Integer> pathA = getPathToNode(A,B);
        ArrayList<Integer> pathB = getPathToNode(A,C);
        int res = 0;
        for(int i=0;i<Math.min(pathA.size(),pathB.size());i++)
        {
            if(pathA.get(i)==pathB.get(i))
            {
                continue;
            }
            else
            {
                res=pathA.get(i);
                break;
            }
        }
        return res;
    }
    public static ArrayList<Integer> getPathToNode(Node A,int Key)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(A==null)
        {
            return result;
        }
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(A);
        while(!myQueue.isEmpty())
        {
            Node myNode = myQueue.poll();
            if(myNode.left==null && myNode.right==null && myNode.data!=Key)
            {
                continue;
            }
            if(Key== myNode.data)
            {
                result.add(myNode.data);
                break;
            }
            if(myNode.left!=null)
            {
                myQueue.add(myNode.left);
                //result.add(myNode.data);
            }
            if(myNode.right!=null)
            {
                myQueue.add(myNode.right);
                //result.add(myNode.data);
            }
            result.add(myNode.data);
        }
        if(result.contains(-1))
        {
            ArrayList<Integer> blank = new ArrayList<>();
            return blank;
        }
        return result;
    }

}
