package com.company.Hashmap;

import java.util.HashMap;

public class firstRepeat {
    public static void main(String[] args) {
        int[] A = {10,5,3,4,3,5,6};
        HashMap<Integer,Integer> hashTable = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            if(hashTable.containsKey(A[i]))
            {
                hashTable.put(A[i],hashTable.get(A[i])+1);
            }
            else
            {
                hashTable.put(A[i],1);
            }
        }
        for(int i=0;i<hashTable.size();i++)
        {
            if(hashTable.get(A[i])==2)
            {
                System.out.println(A[i]);
                break;
            }
        }
    }
}
