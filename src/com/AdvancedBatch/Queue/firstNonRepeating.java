package com.AdvancedBatch.Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeating {
    public static void main(String[] args) {
        String myString = "abadbc";
        System.out.println(solve(myString));
        String optimi = optimized(myString);
        System.out.println(optimi);
    }
    public static String solve(String myString)
    {
        Queue<Character> myQueue = new LinkedList<>();
        for(int i=0;i<myString.length();i++)
        {
            myQueue.add(myString.charAt(i));
        }
        StringBuilder finalString = new StringBuilder();
        StringBuilder convertedString = new StringBuilder();
        while(myQueue.isEmpty()==false)
        {
            Character c = myQueue.poll();
            convertedString.append(c);
            finalString.append(getFirstNonRepeating(convertedString.toString()));
        }
        return finalString.toString();
    }
    public static Character getFirstNonRepeating(String a)
    {
        HashMap<Character, Integer> map = new HashMap<>();
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
        }
        for(int i=0;i<a.length();i++)
        {
            if(map.get(a.charAt(i))==1)
            {
                return a.charAt(i);
            }
        }
        return '#';
    }

    public static String optimized(String A)
    {
        Queue<Character> q = new LinkedList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            Character c = A.charAt(i);
            if(map.get(c)!=null)
            {
                map.put(c,2);
            }
            else
            {
                q.add(c);
                map.put(c,1);
            }
            while(q.size()>0 && map.get(q.peek())>1)
            {
                q.remove();
            }
            if(q.size()>0)
            {
                sb.append(q.peek());
            }
            else
            {
                sb.append('#');
            }
        }
        return sb.toString();
    }


}
