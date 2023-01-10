package com.AdvancedBatch.Queue;

import java.util.ArrayList;

public class maxSlideElement {
    public static void main(String[] args) {
        int[] A = {1,3,-1,-3,5,3,6,7};
        ArrayList<Integer> result = convertArrayToArrayList(A);
        ArrayList<Integer> result2= solve(result,3);
        for(int i:result2)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> convertArrayToArrayList(int[] A)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            result.add(A[i]);
        }
        return result;
    }


    public static ArrayList<Integer> solve(ArrayList<Integer> arraylist,int B)
    {
        ArrayList<Integer> result=new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arraylist.size()-B+1;i++)
        {
            //int max = Integer.MIN_VALUE;
            for(int j=i;j<(i+B);j++)
            {
                max=Math.max(arraylist.get(j),max);
            }
            result.add(max);
        }
        return result;
    }


}
