package com.company.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class commonElemets {
    public static void main(String[] args) {
        //int[] A = {2,1,4,10};//{1,2,2,1};
        //int[] B = {3,6,2,10,10};//{2,3,1,2};
        int[] A = {1,2,2,1};
        int[] B = {2,3,1,2};
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(hmap.containsKey(A[i]))
            {
                hmap.put(A[i],hmap.get(A[i])+1);
            }
            else
            {
                hmap.put(A[i],1);
            }
        }
        for(int i=0;i<B.length;i++)
        {
            if(hmap.containsKey(B[i]) && hmap.get(B[i])>0)
            {
                hmap.put(B[i],hmap.get(B[i])-1);
                result.add(B[i]);
            }
        }
        System.out.println(result);

    }
}
