package com.AdvancedBatch.TwoPointer;

import java.util.ArrayList;
import java.util.HashSet;

public class pairWithGivenDifference {
    public static void main(String[] args) {
        int[] A = {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
        int B = 3;
        System.out.println(countBruteForce(A,B));

    }
    public static int countBruteForce(int[] A, int B)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            hs.add(A[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(var i : hs)
        {
            result.add(i);
        }

        int count=0;
        for(int i=0;i<result.size();i++)
        {
            for(int j=i+1;j<result.size();j++)
            {
                int diff = result.get(j)-result.get(i);
                if(diff<0)
                {
                    diff=diff*-1;
                }
                if(diff==B)
                {
                    count++;
                }
            }
        }
        return count;
    }

}
