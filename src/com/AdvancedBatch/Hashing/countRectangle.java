package com.AdvancedBatch.Hashing;

import java.util.HashMap;

public class countRectangle {
    public static void main(String[] args) {
        int[] A = {1,1,2};
        int[] B = {1,2,1};
        //System.out.println(bruteForce(A,B));
        System.out.println(optimized(A,B));
    }
    public static int optimized(int[] A, int[] B)
    {
        HashMap<Integer,Integer> mapx = new HashMap<>();
        HashMap<Integer,Integer> mapy = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(mapx.containsKey(A[i]))
            {
                mapx.put(A[i],mapx.get(A[i])+1);
            }
            else
            {
                mapx.put(A[i],1);
            }
            if(mapy.containsKey(B[i]))
            {
                mapy.put(B[i],mapy.get(B[i])+1);
            }
            else
            {
                mapy.put(B[i],1);
            }
        }
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            int a = mapx.get(A[i]);
            int b = mapy.get(B[i]);
            ans=ans+(((a-1)*(b-1))%(1000000000+7));
        }
        return ans;
    }

    public static int bruteForce(int[] A, int[] B)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                for(int k=j+1;k<A.length;k++)
                {
                    Pairr p1 = new Pairr(A[i],B[i]);
                    Pairr p2 = new Pairr(A[j],B[j]);
                    Pairr p3 = new Pairr(A[k],B[k]);
                    if(check(p1,p2,p3))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static boolean check(Pairr p1, Pairr p2, Pairr p3)
    {
        //P is pivot
        if((p1.x==p3.x && p1.y==p2.y) || (p1.x==p2.x && p1.y==p3.y))
        {
            return true;
        }
        //Q is pivot
        else if((p2.x == p1.x && p2.y==p3.y) || (p2.x==p3.x && p2.y==p1.y))
        {
            return true;
        }
        //R is pivot
        else if((p3.x==p1.x && p3.y==p1.y) || (p3.x==p2.x && p3.y==p1.y))
        {
            return true;
        }
        // P a,b Q c,d R e,f
        // p pivot
         return false;
    }


}
class Pairr
{
    int x;
    int y;
    Pairr(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

}
