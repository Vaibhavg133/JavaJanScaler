package com.AdvancedBatch.Tries;

import java.util.ArrayList;
import java.util.Arrays;

public class spellChecker {
    public static void main(String[] args) {
        String[] A = {"hat","cat","rat"};
        String[] B = {"cat","ball"};
        ArrayList<Integer> res = solve(A,B);
        for(int i : res)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> solve(String[] A,String[] B)
    {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<String> a = stringToList(A);
        ArrayList<String> b = stringToList(B);
        for(int i=0;i<b.size();i++)
        {
            if(a.contains(b.get(i)))
            {
                res.add(1);
            }
            else
            {
                res.add(0);
            }
        }
        return res;
    }
    public static ArrayList<String> stringToList(String[] B)
    {
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<B.length;i++)
        {
            res.add(B[i]);
        }
        return res;
    }


}
