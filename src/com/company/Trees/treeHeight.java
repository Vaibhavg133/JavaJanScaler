package com.company.Trees;

import com.sun.source.tree.Tree;

public class treeHeight {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        inOrder(root);
        int max = TreeHeight(root);
        System.out.println(max);

    }
    public static void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static int TreeHeight(TreeNode root)
    {
        int maxHeight = Integer.MIN_VALUE;
        if(root==null)
        {
            return 0;
        }
        int max = 1;
        TreeNode current = root;
        while(current!=null)
        {
            if(current.right!=null && current.left!=null)
            {
                 max++;
            }
        }
        return max;
    }


}
class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d)
    {
        data=d;
        left=right=null;
    }
}

