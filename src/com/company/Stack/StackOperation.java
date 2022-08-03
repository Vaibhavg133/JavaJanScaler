package com.company.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class StackOperation {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=100;i>=0;i--)
    {
        arr.add(i);
    }
    int min=  Integer.MAX_VALUE;
    for(int i:arr)
    {
        min=Math.min(i,min);
    }
        System.out.println(min);
    }
}
class StackOp
{
    ArrayList<Integer> arr;
    StackOp()
    {arr=new ArrayList<>();
    }


}

