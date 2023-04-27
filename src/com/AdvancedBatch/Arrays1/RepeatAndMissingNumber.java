package com.AdvancedBatch.Arrays1;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        int[] A = {4,3,2,3};//{3,1,2,5,3};
        ArrayList<Integer> myresult = repeatedNumber(A);
        System.out.println(myresult);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : A)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        int AA = 0;
        for(int i : A)
        {
            if(map.get(i)>=2)
            {
                AA=i;
                break;
            }
        }
        System.out.println(AA);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : A)
        {
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        int B = 0;
        for(int i=min;i<=max;i++)
        {
            if(map.containsKey(i)==false)
            {
                B=i;
                break;
            }
        }
        System.out.println(B);
    }
    public static ArrayList<Integer> repeatedNumber(final int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : A)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : A)
        {
            if(map.get(i)>=2)
            {
                result.add(i);
                break;
            }
        }
        int flag=0;
        for(int i=min;i<=max;i++)
        {
            if(map.containsKey(i)==false)
            {

                result.add(i);
                return result;
                //break;
            }
            flag=1;
        }
        if(flag==1)
        {
            int B = min-1;
            result.add(B);
            return result;
        }
        return result;
    }
}
