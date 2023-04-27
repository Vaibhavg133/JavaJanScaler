package com.AdvancedBatch.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String[] myTestCase ={ "..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.."};// {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
        for(String i : myTestCase)
        {
            myList.add(i);
        }
        System.out.println(myList);
        boolean result = validSudoku(myList);
        System.out.println(result);

    }
    public static boolean validSudoku(final ArrayList<String> list)
    {
        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.get(i).length();j++)
            {
                if(list.get(i).charAt(j)!='.')
                {
                    String row = "Row_"+i+"_"+list.get(i).charAt(j);
                    if(map.containsKey(row))
                    {
                        return false;
                    }
                    else
                    {
                        map.put(row,1);
                    }
                    String col = "Col_"+j+"_"+list.get(i).charAt(j);
                    if(map.containsKey(col))
                    {
                        return false;
                    }
                    else {
                        map.put(col,1);
                    }
                    String box = "Box_"+(((i*3)/3)+(j/3))+"_"+list.get(i).charAt(j);
                    if(box.startsWith("Box_5_"))
                    {
                        System.out.println("test");
                    }
                    if(map.containsKey(box))
                    {
                        return false;
                    }
                    else {
                        map.put(box,1);
                    }

                }
            }
        }
        return true;
    }
}
