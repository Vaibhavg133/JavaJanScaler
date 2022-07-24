package com.company.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class pallindrome {
    public static void main(String[] args) {
        //String a = "aabbee";
        String a = "vnpbeutxfqxriiajoejjmtjcx";
        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++)
        {
            if(map.containsKey(a.charAt(i)))
            {
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            }
            else
            {
                map.put(a.charAt(i),1);
            }
            set.add(a.charAt(i));
        }
//        map.get("a")
        if(a.length()%2==0)
        {
            int countChar = 0;
            int freq = 0;
            for(char c : set)
            {
                if(map.get(c)%2==0)
                {
                    freq+=map.get(c);
                }
                countChar++;
            }
            if(freq==(2*countChar))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        else
        {
            int countEven=0;
            int countOdd=0;
            for(char c : set)
            {
                if(map.get(c)%2==0)
                {
                    countEven+=map.get(c);
                }
                else
                {
                    countOdd+=map.get(c);
                }
            }
            if(countOdd%2==1 && countEven%2==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

    }
}
