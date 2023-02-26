package com.AdvancedBatch.Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class XORSub {
    public static void main(String[] args) {
        int[] A = {37, 24, 17, 26, 37, 10, 15, 35, 7, 33};
        ArrayList<Integer> result = getXORArray(A);
        for(int i:result)
        {
            System.out.print(i+" ");
        }


    }
    public static int bruteForce(int[] A)
    {
        int res=Integer.MIN_VALUE;
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                PS[i]=A[i];
            }
            else
            {
                PS[i]=PS[i-1]^A[i];
            }
        }
        for(int i=0;i<A.length;i++)
        {
        }
        return 0;
    }
    public static ArrayList<Integer> getXORArray(int[] A)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int L=A.length+1;
        int R=A.length+1;
        int size=Integer.MAX_VALUE;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int xor=0;
                for(int k=i;k<=j;k++)
                {
                    xor^=A[k];
                }
                res= Math.max(res,xor);

                if(res==xor) {
                    if(L!=i || R!=j)
                    {
                        L=Math.min(L,i);
                        R=Math.min(R,j);
                    }

                }

            }

        }
        result.add(L+1);
        result.add(R+1);
        return result;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A)
    {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++)
        {
            for(int j=i;j<A.size();j++)
            {
                ArrayList<Integer> tempList = new ArrayList<>();
                int xor=0;
                for(int k=i;k<=j;k++)
                {
                    tempList.add(getIndex(A,A.get(k)));
                    xor=xor^A.get(k);
                }
                map.put(tempList,xor);
                max=Math.max(max,xor);
            }
        }
        for(Map.Entry<ArrayList<Integer>,Integer> element : map.entrySet())
        {
            if(element.getValue()==max)
            {
                return element.getKey();
            }
        }
        return result;
    }
    public static int getIndex(ArrayList<Integer> list,int A)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==A)
            {
                return i+1;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> arrayToList(int[] A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            result.add(A[i]);
        }
        return result;
    }
}
