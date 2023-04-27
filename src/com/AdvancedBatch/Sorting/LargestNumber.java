package com.AdvancedBatch.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] A = {0,0,0,0,0};//{3,30,34,9,5};//{2,9,3,0};
        ArrayList<String> list = new ArrayList<>();
        for(int i : A)
        {
            list.add(String.valueOf(i));
        }
        System.out.println(list);
        Collections.sort(list,new LargestNumberComparator());
        System.out.println(list);
        if(list.get(0).equals("0"))
        {
            System.out.println(0);
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            for(String i : list)
            {
                sb.append(i);
            }
            System.out.println(sb.toString());
        }

    }
}
class LargestNumberComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        String a = o1+o2;
        String b = o2+o1;
        return b.compareTo(a);
    }
}

