package com.AdvancedBatch.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class expressionEvaluate {
    public static void main(String[] args) {
        String[] myExpression = {"2","2","/"};//{"2", "1", "+", "3", "*"};//{"4","13","5","/","+"};
        ArrayList<String> myExp = stringToArrayListConverter(myExpression);
        System.out.println(solve(myExp));
    }
    public static ArrayList<String> stringToArrayListConverter(String[] A)
    {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            result.add(A[i]);
        }
        return result;
    }

    public static int solve(ArrayList<String> A)
    {
        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)=="+" || A.get(i)=="*" || A.get(i)=="/" || A.get(i)=="-")
            {
                int a=myStack.pop();
                int b=myStack.pop();
                String operand=A.get(i);
                int myResult = evaluate(a,b,operand);
                myStack.push(myResult);
            }
            else
            {
                myStack.push(Integer.valueOf(A.get(i)));
            }
        }
        return myStack.peek();
    }
    public static int evaluate(int a,int b, String operand)
    {
        if(operand=="+")
        {
            return a+b;
        }
        if(operand=="*")
        {
            return a*b;
        }
        if(operand=="/" && a!=0)
        {
            return b/a;
        }
        return a-b;
    }


}
