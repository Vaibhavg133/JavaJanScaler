package com.company.Stack;

public class stacktest {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);
        while(!s.isEmpty())
        {
            int d = s.getTop();
            System.out.println(d);
            s.pop();
        }
    }
}
