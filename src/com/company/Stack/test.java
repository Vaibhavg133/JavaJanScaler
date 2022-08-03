package com.company.Stack;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Stack a = new Stack();
        a.push(10);
        System.out.println(a.getTop());
        a.push(20);
        System.out.println(a.getTop());
        a.pop();
        System.out.println(a.getTop());
    }
}
class Stack
{
    ArrayList<Integer> a;
    Stack()
    {a=new ArrayList<>();}
    public void push(int data)
    {
        a.add(data);
    }
    public void pop()
    {
        a.remove(a.size()-1);
    }
    public int getTop()
    {
        return a.get(a.size()-1);
    }
}

