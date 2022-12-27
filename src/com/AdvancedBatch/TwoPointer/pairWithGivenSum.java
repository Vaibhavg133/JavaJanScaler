package com.AdvancedBatch.TwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class pairWithGivenSum {
    public static void main(String[] args) {
        int[] A = {1,1,1,1};//{2,3,5,6,10};
        int count=2;
        solve2(A,count);
        counter(A,count);
    }
    public static void counter(int[] A, int B)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i : A)
        {
            if(map.containsKey(B-i))
            {
                count+=map.get(i);
            }
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        System.out.println(count);
    }

    public static void solve2(int[] A, int B)
    {
        int counter=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if((A[i]+A[j])==B)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void solve(int [] A, int B)
    {
        int i=0;
        int count=0;
        int j=A.length-1;
        while(i<j)
        {
            int sum=A[i]+A[j];
            if(sum==B)
            {
                count++;
                i++;
                j--;
            }
            else if(sum<B)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        System.out.println(count);
    }

}
