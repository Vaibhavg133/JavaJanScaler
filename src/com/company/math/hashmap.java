package com.company.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        int[] A = {2,1,2};
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++)
        {
            if(hs.containsKey(A[i]))
            {
                hs.put(A[i],hs.get(A[i])+1);
            }
            else
            {
                hs.put(A[i],1);
            }
        }
        System.out.println(hs);
        int size = A.length;
        for(Map.Entry entry : hs.entrySet())
        {
            int res = (int)(entry.getValue());
            if(res>=size/3)
            {

            }
        }
    }
}
