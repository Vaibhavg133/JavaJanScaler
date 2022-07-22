package com.company.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class commonElemets {
    public static void main(String[] args) {
        int[] A = {2,1,4,10};//{1,2,2,1};
        int[] B = {3,6,2,10,10};//{2,3,1,2};
        ArrayList<Integer> op = new ArrayList<Integer>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int val: A){
            if ( !hmap.containsKey(val) ) {
                hmap.put( val, 1 );
            }
            else {
                hmap.put( val, hmap.get(val) + 1 );
            }
        }

        for(int val: B) {
            if ( hmap.containsKey(val) && hmap.get(val) > 0 ) {
                hmap.put( val, hmap.get(val) - 1 );
                op.add(val);
            }
        }
        for(int i=0;i<op.size();i++)
        {
            System.out.print(op.get(i)+" ");
        }
    }
}
