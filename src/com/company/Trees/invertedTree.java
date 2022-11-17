package com.company.Trees;

import com.sun.source.tree.Tree;

public class invertedTree {
    public static void main(String[] args) {
        TreeNodee root = new TreeNodee(1);
        root.left = new TreeNodee(2);
        root.right = new TreeNodee(3);
        mirror(root);
    }
    public static void mirror(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        mirror(root.left);
        mirror(root.right);
        //swap(root.left,root.right);
        TreeNodee temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
