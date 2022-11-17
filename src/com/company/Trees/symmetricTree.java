package com.company.Trees;

public class symmetricTree {
    public static void main(String[] args) {
        TreeNodee root = new TreeNodee(1);
        root.left = new TreeNodee(2);
        root.right = new TreeNodee(2);
        root.left.left = new TreeNodee(3);
        root.left.right = new TreeNodee(4);
        root.right.left = new TreeNodee(4);
        root.right.right = new TreeNodee(3);
        int res = solve(root);
        System.out.println(res);
    }
    public static int solve(TreeNodee root)
    {
        if(compare(root,root))
        {
            return 1;
        }
        return 0;

    }
    public static boolean compare(TreeNodee lh, TreeNodee rh)
    {
        if(lh==null || rh==null)
        {
            return lh==rh;
        }
        if(lh.data!=rh.data)
        {
            return false;
        }
        return compare(lh.right,rh.left) && compare(lh.left,rh.right);
    }


}
