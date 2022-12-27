package com.AdvancedBatch.Hashing;

import java.util.*;

public class longestConsecutiveSum {
    public static void main(String[] args) {
        int[] A = {100,4,400,1,3,2};//{1,1,2,2,3,3,4,4,5,5};
        System.out.println(solve(A));
    }
    public static int solve(int[] A)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : A)
        {
            set.add(i);
        }
        ArrayList<Integer> myList = new ArrayList<>();
        for(Integer i : set)
        {
            myList.add(i);
        }
        Collections.sort(myList); //1,2,3,4,100,400
        int ans=Integer.MIN_VALUE;int count=0;
        for(int i=0;i<myList.size();i++)
        {
            if(i>0 && myList.get(i)==myList.get(i-1)+1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            ans=Math.max(ans,count);
        }
        return count;
    }

}
