package com.AdvancedBatch.Stacks;

import java.util.Stack;

public class Double_Character_Trouble {
    public static void main(String[] args) {
        String A = "aaaaa";//"abccbc";//"abbcd";
        String res = solve(A);
        System.out.println(res);

    }
    public static String solve(String Str)
    {
        Stack<Character> myStack = new Stack<>();
        myStack.push(Str.charAt(0));
        for(int i=1;i<Str.length();i++)
        {
            if(myStack.isEmpty()==false && myStack.peek()==Str.charAt(i))
            {
                myStack.pop();
            }
            else
            {
                myStack.push(Str.charAt(i));
            }
        }
        StringBuilder myString = new StringBuilder();
        while(!myStack.isEmpty())
        {
            myString.append(myStack.pop());
        }
        StringBuilder finalString=new StringBuilder();
        for(int i=myString.length()-1;i>=0;i--)
        {
            finalString.append(myString.charAt(i));
        }
        return finalString.toString();
    }

}
