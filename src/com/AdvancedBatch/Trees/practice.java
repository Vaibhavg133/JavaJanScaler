package com.AdvancedBatch.Trees;

import com.sun.source.tree.Tree;

public class practice {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        inOrder(root);
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

}
class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d) {
        data = d;
        left = right = null;
    }
}
