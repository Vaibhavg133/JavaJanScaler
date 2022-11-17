package com.HackerRank;

import java.util.ArrayList;

public class BreakingRecords {
    public static void main(String[] args) {
        int[] Ar = {10,5,20,20,4,5,2,25,1};//{12,24,10,24};
        ArrayList<Integer> res = arrayToList(Ar);
        ArrayList<Integer> ans = breakingRecords(res);
        for(int i : ans)
        {
            System.out.println(i);
        }

    }
    public static ArrayList<Integer> arrayToList(int[] Array)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i:Array)
        {
            result.add(i);
        }
        return result;
    }

    public static ArrayList<Integer> breakingRecords(ArrayList<Integer> scores)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int currentMax=scores.get(0);
        int countMax=0;
        for(int i=1;i<scores.size();i++)
        {
            if(scores.get(i)>=currentMax && scores.get(i)!=currentMax)
            {
                currentMax=scores.get(i);
                countMax++;
            }
        }
        result.add(countMax);
        int currentMin=scores.get(0);
        int countMin = 0;
        for(int i=1;i<scores.size();i++)
        {
            if(scores.get(i)<=currentMin && scores.get(i)!=currentMin)
            {
                currentMin=scores.get(i);
                countMin++;
            }
        }
        result.add(countMin);
        return  result;
    }

}
