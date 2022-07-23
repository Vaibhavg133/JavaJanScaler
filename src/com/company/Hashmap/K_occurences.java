package com.company.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class K_occurences {
    public static void main(String[] args) {
        int N = 5;
        int B = 2;
        int[] C = {1,2,2,2,3,3};
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<C.length;i++)
        {
            if(map.containsKey(C[i]))
            {
                map.put(C[i],map.get(C[i])+1);
            }
            else
            {
                map.put(C[i],1);
            }
            set.add(C[i]);
        }
//        int sum=0;
        for(int i : set)
        {
            //System.out.println(map.containsKey());
            //System.out.println(map.);
        }
        //System.out.println(sum);
    }
}
