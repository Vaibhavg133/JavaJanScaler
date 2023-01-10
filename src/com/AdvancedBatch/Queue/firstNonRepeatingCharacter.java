package com.AdvancedBatch.Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String myString = "abcabc";//"abadbc";
        String result = myProblemSolver(myString);
        //System.out.println(firstNonRepeatingCharacter(myString));
        System.out.println(result);
    }
    public static String myProblemSolver(String A)
    {
        Queue<Character> myQueue = new LinkedList<>();
        for(int i=0;i<A.length();i++)
        {
            myQueue.add(A.charAt(i));
        }
        StringBuilder B = new StringBuilder();
        StringBuilder tempString = new StringBuilder();
        while(myQueue.size()!=0)
        {
            Character myFront = myQueue.peek();
            tempString.append(myFront);
            Character myChar = firstNonRepeatingCharacter(tempString.toString());
            B.append(myChar);
            myQueue.poll();
        }
        return B.toString();
    }

    public static Character firstNonRepeatingCharacter(String myString)
    {
        Character myChar = '#';
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<myString.length();i++)
        {
            if(map.containsKey(myString.charAt(i)))
            {
                map.put(myString.charAt(i),map.get(myString.charAt(i))+1);
            }
            else
            {
                map.put(myString.charAt(i),1);
            }
        }
        for(int i=0;i<myString.length();i++)
        {
            if(map.get(myString.charAt(i))==1)
            {
                myChar=myString.charAt(i);
                break;
            }
        }
        return myChar;
    }

}
