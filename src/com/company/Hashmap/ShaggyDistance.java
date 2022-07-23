package com.company.Hashmap;

import java.util.HashMap;

public class ShaggyDistance {
    public static void main(String[] args) {
        //int[] A = {7,1,3,4,1,7};
        int[] A = {1,1};
        int res = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i])==false)
            {
                map.put(A[i],i);
            }
            else
            {
                int len = i - map.get(A[i]);
                res=Math.min(res,len);
            }
        }
        System.out.println(res);
    }
}
