package com.AdvancedBatch.Tries;

public class maxXorSubarray {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        XORSTrie root=new XORSTrie();
        for(int i : A)
        {
            root.insert(i);
        }
        int res = root.maxXor(A);
        System.out.println(res);
    }
}
class XORSubNode
{
    XORSubNode left;
    XORSubNode right;
    XORSubNode()
    {
        left=right=null;
    }
}
class XORSTrie
{
    XORSubNode root;
    XORSTrie()
    {
        root=new XORSubNode();
    }
    void insert(int No)
    {
        XORSubNode temp = root;
        for(int i=31;i>=0;i--)
        {
            int bit=(No>>i)&1;
            if(bit==1)
            {
                if(temp.right==null)
                {
                    temp.right=new XORSubNode();
                }
                temp=temp.right;
            }
            else if(bit==0)
            {
                if(temp.left==null)
                {
                    temp.left=new XORSubNode();
                }
                temp=temp.left;
            }
        }
    }
    int getMaxXor(int no)
    {
        XORSubNode temp = root;
        int currentAns=0;
        for(int i=31;i>=0;i--)
        {
            int bit = (no>>i)&1;
            if(bit==0)
            {
                if(temp.right!=null)
                {
                    temp=temp.right;
                    currentAns+=1<<i;
                }
                else
                {
                    temp=temp.left;
                }
            }
            else if(bit==1)
            {
                if(temp.left!=null)
                {
                    currentAns+=1<<i;
                    temp=temp.left;
                }
                else
                {
                    temp=temp.right;
                }
            }
        }
        return currentAns;
    }
    public int maxXor(int[] A)
    {
        int res=Integer.MIN_VALUE;
        for(int i : A)
        {
            res=Math.max(res,getMaxXor(i));
        }
        return res;
    }


}


