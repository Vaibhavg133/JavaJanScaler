package com.company.Trees;

import com.sun.source.tree.Tree;

public class countingTheNodes {
    public static void main(String[] args) {
        TreeNodee root = new TreeNodee(4);
        root.left = new TreeNodee(5);
        root.right = new TreeNodee(2);
        root.right.left = new TreeNodee(3);
        root.right.right = new TreeNodee(6);
        int res = solve(root);
        System.out.println(res);
    }
    public static int dfs(TreeNodee A)
    {
        if(A==null)
        {
            return 0;
        }
        if(A.data<dfs(A.left))
        {
            return 1;
        }
        if(A.data<dfs(A.right))
        {
            return 1;
        }
        return 1;
    }
    public static int solve(TreeNodee A)
    {
        return dfs(A);
    }

}
class TreeNodee
{
    int data;
    TreeNodee left;
    TreeNodee right;
    TreeNodee(int d)
    {
        data=d;
        left=right=null;
    }

}

