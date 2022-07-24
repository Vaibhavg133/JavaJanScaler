package com.company.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class K_occurences {
    public static void main(String[] args) {
        int N = 6;//5;
        int B = 2;
        int[] C ={1000000000, 1000000000, 999999999, 999999999, 999999998, 1};//{2,2,2,2};
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
        int sum=0;
        for(int i:set)
        {
            System.out.println(i+":"+map.get(i));
            if(map.get(i)==B)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
