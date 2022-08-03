package com.company.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class paranthesisBalanced {
    public static void main(String[] args) {
        String ch = "{[(])}";
        System.out.println(solve(ch));

    }
    public static int solve(String A)
    {
        if(A.charAt(0)==')' || A.charAt(0)=='}' || A.charAt(0)==']')
        {
            return 0;
        }
        if(A.charAt(A.length()-1)=='(' || A.charAt(A.length()-1)=='{' || A.charAt(A.length()-1)=='[')
        {
            return 0;
        }
        int countLeft=0,countRight=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='(' || A.charAt(i)=='{' || A.charAt(i)=='[')
            {
                countLeft++;
            }
            else if(A.charAt(i)==')' || A.charAt(i)=='}' || A.charAt(i)==']')
            {
                countRight++;
            }
        }
        if(countLeft!=countRight)
        {
            return 0;
        }
        ParenStack stack = new ParenStack();
        for(int i=0;i<A.length();i++)
        {
            char chh = A.charAt(i);
            if(chh=='(' || chh=='{' || chh=='[')
            {
                stack.push(chh);
            }
            else if (chh==')')
            {
                if(stack.getTop()=='(')
                {
                    stack.pop();
                }
                else
                {
                    return 0;
                }

            }
            else if(chh=='}')
            {
                if(stack.getTop()=='{')
                {
                    stack.pop();
                }
                else
                {
                    return 0;
                }
            }
            else if(chh==']')
            {
                if(stack.getTop()=='[')
                {
                    stack.pop();
                }
                else
                {
                    return 0;
                }
            }
        }
        if(stack.isEmpty())
        {
            return 1;
        }
        return 0;
    }

}
class ParenStack
{
    ArrayList<java.lang.Character> arr;
    ParenStack()
    {
        arr=new ArrayList<>();
    }
    void push(char ch)
    {
        arr.add(ch);
    }
    void pop()
    {
        if(isEmpty())
        {
           return;
        }
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

