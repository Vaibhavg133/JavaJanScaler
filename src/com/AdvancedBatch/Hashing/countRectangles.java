package com.AdvancedBatch.Hashing;

import java.util.HashMap;

public class countRectangles {
    public static void main(String[] args) {
        int[] A = {1,1,2,2};//3,3};
        int[] B = {1,2,1,2};//,1,2};
        System.out.println(countRect(A,B));
        //System.out.println(countRectangless(A,B));
    }
    public static int countRect(int[] A,int[] B)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                for(int k=j+1;k<A.length;k++)
                {
                    for(int l=k+1;l<A.length;l++)
                    {
                        if(check(A[i],B[i],A[j],B[j],A[k],B[k],A[l],B[l]))
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static boolean check(int a, int b, int c, int d, int e, int f, int g, int h)
    {
        if((c<=e) || (a>=g) || (d<=g) || (b>=h))
        {
            return false;
        }
        return true;
    }


    public static int countRectangless(int[] A, int[] B)
    {
        HashMap<Pair,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            Pair p = new Pair(A[i],B[i]);
            if(map.containsKey(p))
            {
                map.put(p,map.get(p)+1);
            }
            else
            {
                map.put(p,1);
            }
        }
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                Pair p1 = new Pair(A[i],B[i]);
                Pair p2 = new Pair(A[j],B[j]);
                if(A[i]!=A[j] && B[i]!=B[j])
                {
                    //make sure diagonals
                    if(map.get(p1)==1 && map.get(p2)==1)
                    {
                        count++;
                    }
                }
            }
        }
        return count/2;
    }

}
class Pair
{
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

