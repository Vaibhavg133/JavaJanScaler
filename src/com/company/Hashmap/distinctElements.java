package com.company.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class distinctElements {
    public static void main(String[] args) {
        int[] A = {1,2,1,3,4,3};
        int B = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<B;i++)
        {
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else {
                map.put(A[i],1);
            }
        }
        System.out.println(map.size());
        for(int i=B;i<A.length;i++)
        {
            if(map.get(A[B-i])==1)
            {
                map.remove(A[i-B]);
            }
            else
            {
                map.put(A[i-B],map.get(A[i-B])-1);
            }
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
            System.out.println(map.size());
        }
    }

    public static ArrayList<Integer> bruteForce(int[] A,int B)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=A.length-B;i++)
        {
            int start=i;
            int end=B+i-1;
            int resu = countDistinct(A,start,end);
            result.add(resu);
        }
        return result;
    }

    public static int countDistinct(int[] A,int start,int end)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=start;i<=end;i++)
        {
            set.add(A[i]);
        }
        int count=0;
        for(int i : set)
        {
            count++;
        }

        return count;
    }

}
