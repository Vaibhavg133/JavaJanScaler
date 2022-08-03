package com.company.Stack;

import java.util.ArrayList;

public class balancedParanthesis {
    public static void main(String[] args) {
        String str = "([{}])";//"()()(((())()))))()(()(()((()(()((()()((())((())(()()()()())())()(((()(()(";//"(()";//"(()())";
//        solve(str);
        System.out.println(solve(str));

    }
    public static boolean solve(String A)
    {
        StackParen stack = new StackParen();
        if(A.charAt(0)==')' || A.charAt(0)=='}' || A.charAt(0)==']')
        {
            return false;
        }
        if(A.charAt(A.length()-1)=='(' || A.charAt(A.length()-1)=='{' || A.charAt(A.length()-1)=='[')
        {
            return false;
        }
        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                stack.push(ch);

            }
            else if(ch==')' || ch=='}' || ch==']')
            {
                stack.pop();

            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }

}
class StackParen
{
    ArrayList<java.lang.Character> arr ;
    StackParen()
    {
        arr = new ArrayList<>();
    }
    void push(char ch)
    {
        arr.add(ch);
    }
    void pop()
    {
        arr.remove(arr.size()-1);
    }
    char getTop()
    {
        if(isEmpty())
        {
            return ' ';
        }
        return arr.get(arr.size()-1);
    }
    boolean isEmpty()
    {
        if(arr.size()==0)
        {
            return true;
        }
        return false;
    }

}

