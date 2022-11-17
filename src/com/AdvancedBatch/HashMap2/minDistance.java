package com.AdvancedBatch.HashMap2;

import java.util.HashMap;

public class minDistance {
    public static void main(String[] args) {
        int[] A = {1,2,3,2,1,2,1,3,2};
        System.out.println(bruteForce(A));
        System.out.println(hashMap(A));
    }
    public static int bruteForce(int [] A )
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]==A[j])
                {
                    min = Math.min(min,(j-i));
                }
            }
        }
        return min;
    }
    public static int hashMap(int[] A)
    {
        int res = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i]))
            {

                res=Math.min(res,i-map.get(A[i]));
                map.put(A[i],i);
            }
            else {
                map.put(A[i],i);
            }
        }
        return res;
    }

}

