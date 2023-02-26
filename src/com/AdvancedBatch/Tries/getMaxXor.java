package com.AdvancedBatch.Tries;

public class getMaxXor {
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        XorTrie root = new XorTrie();
        for(int i : A)
        {
            root.insert(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i : A)
        {
            max=Math.max(max,root.getXor(i));
        }
        System.out.println(max);

    }
}
class myNode
{
    //int data;
    myNode left;
    myNode right;
    myNode()
    {
        //this.data=data;
        left=right=null;
    }
}
class XorTrie
{
    myNode root;
    XorTrie()
    {
        root=new myNode();
    }
    public void insert(int myNumber)
    {
        myNode temp = root;
        for(int i=31;i>=0;i--)
        {
            int bit=(myNumber>>i)&1;
            if(bit==0)
            {
                if(temp.left==null)
                {
                    temp.left=new myNode();
                }
                temp=temp.left;
            }
            else
            {
                if(temp.right==null)
                {
                    temp.right=new myNode();
                }
                temp=temp.right;
            }
        }
    }
    public int getXor(int no)
    {
        int currentAns =0;
        myNode temp = root;
        for(int i=31;i>=0;i--)
        {
            int bit = (no>>>i) & 1;
            if(bit==0)
            {
                if(temp.right!=null)
                {
                    currentAns+=(1<<i);
                    temp=temp.right;
                }
                else
                {
                    temp=temp.left;
                }
            }
            else
            {
                if(temp.left!=null)
                {
                    currentAns+=(1<<i);
                    temp=temp.left;
                }
                else {
                    temp=temp.right;
                }
            }
        }
        return currentAns;
    }
    public int getXOR(int num)
    {
        myNode curr = root;
        int currSum = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (bit == 0) {
                if (curr.right != null) {
                    currSum += (1 << i);
                    curr = curr.right;
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.left != null) {
                    currSum += (1 << i);
                    curr = curr.left;
                } else {
                    curr = curr.right;
                }
            }
        }
        return currSum;
    }

}

