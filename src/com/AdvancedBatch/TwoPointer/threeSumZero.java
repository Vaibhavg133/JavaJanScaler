package com.AdvancedBatch.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class threeSumZero {
    public static void main(String[] args) {
        int[] A = {-1,0,1,2,-1,4,-2,0,0};
        //twoSum(A);
//        ArrayList<ArrayList<Integer>> two = twoSum(A,0);
//        for(ArrayList<Integer> p : two)
//        {
//            for(Integer i : p)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
        ArrayList<ArrayList<Integer>> result = threeSum(A);
        for(ArrayList<Integer> p : result)
        {
            for(Integer a : p)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> threeSum(int[] A)
    {
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(A==null){return result;}
        for(int i=0;i<A.length-3;i++)
        {
            int elem = A[i];
            ArrayList<ArrayList<Integer>> res = twoSum(A,i+1,-1*elem);
            for(ArrayList<Integer> p : res)
            {
                p.add(elem);
                result.add(p);
            }
        }
        return result;
    }
    public static ArrayList<ArrayList<Integer>> twoSum(int[] A,int start,int B)
    {
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i=start;
        int j=A.length-1;
        while(i<j)
        {
            int sum=A[i]+A[j];
            if(sum==B)
            {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(A[i]);
                res.add(A[j]);
                result.add(res);
                //System.out.println(A[i]+" "+A[j]);
                i++;
                j--;
            }
            else if(sum<0)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return result;
    }


}
