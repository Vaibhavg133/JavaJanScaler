package com.company;

import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

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
        //root.left.left.right=new Noddy(8);
        //inOrder(root);
        //System.out.println();
        //preOrder(root);
        //System.out.println();
        //postOrder(root);
        //System.out.println();
        //ArrayList<Integer> res=inOrderIterative(root);
        //printList(res);
        postOrder(root);
        System.out.println();
        //ArrayList<Integer> res2 = preOrderIterative(root);
        ArrayList<Integer> res2 = postOrderIterative(root);
        printList(res2);
    }
    public static void printList(ArrayList<Integer> result)
    {
        for(int x : result)
        {
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> postOrderIterative(Noddy root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Stack<Noddy> stack1 = new Stack<>();
        Stack<Noddy> stack2 = new Stack<>();
        stack1.push(root);
        while(stack1.isEmpty()==false)
        {
            Noddy node = stack1.peek();
            stack1.pop();
            stack2.push(node);
            if(node.left!=null)
            {
                stack1.push(node.left);
            }
            if(node.right!=null)
            {
                stack1.push(node.right);
            }
        }
        while(stack2.isEmpty()==false)
        {
            Noddy node = stack2.peek();
            stack2.pop();
            result.add(node.data);
        }
        return result;
    }


    public static ArrayList<Integer> preOrderIterative(Noddy root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Stack<Noddy> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            Noddy current = stack.peek();
            result.add(current.data);
            stack.pop();
            if(current.right!=null)
            {
                stack.push(current.right);
            }
            if(current.left!=null)
            {
                stack.push(current.left);
            }
        }
        return result;
    }
    public static ArrayList<Integer> inOrderIterative(Noddy root)
    {
        ArrayList<Integer> array = new ArrayList<>();
        if(root==null)
        {
            return array;
        }
        Stack<Noddy> stack = new Stack<>();
        Noddy current = root;
        while(current!=null || !stack.isEmpty())
        {
            while(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            array.add(current.data);
            current=current.right;
        }
        return array;
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

