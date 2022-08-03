package com.company.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class inOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        inOrderRecursion(root);
        System.out.println();
        postOrderRecursion(root);
        System.out.println();
        ArrayList<Integer> res = postOrderWithoutRecursion(root);
        printList(res);
//        ArrayList<Integer> res = inOrderWithoutRecursion(root);
//        printList(res);
    }
    public static void printList(ArrayList<Integer> arr)
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
    public static ArrayList<Integer> postOrderWithoutRecursion(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(current!=null || !stack.isEmpty())
        {
            while(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            result.add(current.data);
            current=current.right;
        }
        return result;
    }

    public static void postOrderRecursion(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.data+" ");
    }


    public static void inOrderRecursion(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrderRecursion(root.left);
        System.out.print(root.data+" ");
        inOrderRecursion(root.right);
    }

    public static ArrayList<Integer> inOrderWithoutRecursion(Node root)
    {
        ArrayList<Integer> data = new ArrayList<>();
        if(root==null)
        {//data.add(-1);
            return data;
        }
        Node current = root;
        Stack<Node> stack = new Stack<Node>();
        while(current!=null || !stack.isEmpty())
        {
            while(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            data.add(current.data);
            current=current.right;
        }
        return data;
    }
}
class  Node
{
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

