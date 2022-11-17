package com.AdvancedBatch.BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class ThreeNplusOne {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        //System.out.println(hashMap(A));
        bitManipulation(A);
    }
    public static void bitManipulation(int[] A)
    {
        int[] myArray = new int[32];
        for(int i : A)
        {
            int j=0;
            while(i!=0)
            {
                int lastBit = i&1;
                myArray[j]+=lastBit;
                i=i>>1;
                j++;
            }
        }
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=myArray[i]%3;
        }
//        for(int i : myArray)
//        {
//            System.out.print(i+" ");
//        }
        //int res = 0;
//        for(int i=0;i<=10;i++)
//        {
//            System.out.print((1<<i)+" ");
//        }
        int res = 0;
        for(int i=0;i<myArray.length;i++)
        {
            int ans = 1<<i;
            int ans2 = myArray[i]*ans;
            res = res + ans2;
        }
        System.out.println(res);
//        for(int i=0;i<myArray.length;i++)
//        {
//            res = res+(A[i]*(1<<i));
//        }
       // System.out.println(res);
    }
    public static int hashMap(int[] A)
    {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i:A)
        {
            if(hmap.containsKey(i))
            {
                hmap.put(i, hmap.get(i)+1);
            }
            else
            {
                hmap.put(i,1);
            }
        }
        for(int i : A)
        {
            if(hmap.containsKey(i) && hmap.get(i)==1)
            {
                return i;
            }
        }
        return -1;
    }
}
