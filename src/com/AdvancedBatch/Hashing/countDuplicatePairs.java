package com.AdvancedBatch.Hashing;

import java.util.HashMap;
import java.util.Map;

public class countDuplicatePairs {
    public static void main(String[] args) {
        int[] A = {1,3,4,1,5,1,4};
        System.out.println(bruteForce(A));
        System.out.println(optimized(A));
        System.out.println(minDistanceBruteForce(A));
    }
    public static int minDistanceBruteForce(int[] A)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]==A[j])
                {
                    min=Math.min(min,(j-i));
                }
            }
        }
        return min;
    }

    public static int bruteForce(int[] A)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]==A[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int optimized(int[] A)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> mapElemet : map.entrySet())
        {
            int key = mapElemet.getKey();
            int val = mapElemet.getValue();
            if(val>=2)
            {
                ans+=(val*(val-1))/2;
            }
        }
        return ans;
    }


}
