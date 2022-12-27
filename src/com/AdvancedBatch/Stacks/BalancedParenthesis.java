package com.AdvancedBatch.Stacks;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String myString = "({)}";
        boolean res = isBalanced(myString);
        System.out.println(res);
    }
    public static boolean isBalanced(String res)
    {
        if(res.startsWith(")") || res.startsWith("]") || res.startsWith("}"))
        {
            return false;
        }
        if(res.endsWith("(") || res.endsWith("[") || res.endsWith("{"))
        {
            return false;
        }
        Stack<Character> myStack = new Stack<>();
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)=='(' || res.charAt(i)=='{' || res.charAt(i)=='[')
            {
                myStack.push(res.charAt(i));
            }
            else
            {
//                Character S=myStack.peek();
                if(myStack.peek()=='(' && res.charAt(i)==')')
                {
                    myStack.pop();
                }
                else if(myStack.peek()=='[' && res.charAt(i)==']')
                {
                    myStack.pop();
                }
                else if(myStack.peek()=='{' && res.charAt(i)=='}')
                {
                    myStack.pop();
                }
            }
        }
        if(myStack.isEmpty())
        {
            return true;
        }
        return false;

    }

}
