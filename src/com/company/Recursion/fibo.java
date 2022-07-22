package com.company.Recursion;

import org.w3c.dom.Node;

public class fibo {
    public static void main(String[] args) {
        int s = fibonacci(4);
        System.out.println(s);
        s=sumOfN(10);
        System.out.println(s);

    }
    public static int sumOfN(int N)
    {
        if(N==1)
        {
            return N;
        }
        return N+sumOfN(N-1);
    }

    public static int fibonacci(int N)
    {
        if(N==0 || N==1)
        {
            return N;
        }
        int f1 = fibonacci(N-1);
        int f2 = fibonacci(N-2);
        return f1+f2;
    }

}
