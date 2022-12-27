package com.AdvancedBatch.Stacks;
/*
*   raceacar
*
* */
import java.util.Stack;

public class ValidPalindrome {
    public static void main(String[] args) {
        String myString = "0P";//"A man, a plan, a canal: Panama";
        boolean res = solve(myString);
        System.out.println(res);
    }
    public static boolean solve(String a)
    {
        Stack<Character> myStack = new Stack<>();
        StringBuilder myString = new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            if((a.charAt(i)>='A' && a.charAt(i)<='Z')||(a.charAt(i)>='a' && a.charAt(i)<='z'))
            {
                myString.append(a.charAt(i));
                myStack.push(a.charAt(i));
            }

        }
        StringBuilder myString2 = new StringBuilder();
        for(int i=myString.length()-1;i>=0;i--)
        {
            myString2.append(myString.charAt(i));
        }
        String res1=myString.toString().toLowerCase();
        String res2=myString2.toString().toLowerCase();
        System.out.println(res1);
        System.out.println(res2);
        if(res2.equals(res1))
        {
            return true;
        }
        return false;
    }

}
