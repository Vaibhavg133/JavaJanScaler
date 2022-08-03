package com.company.Recursion;

public class op {
    public static void main(String[] args) {
        //int ans=fun(2,10);
        //System.out.println(ans);
        int ans = foo(3,5);
        System.out.println(ans);

    }

    public static int bar(int x,int y)
    {
        if(y==0) return 0;
        return (x+bar(x,y-1));
    }
    public static int foo(int x,int y)
    {
        if(y==0) return 1;
        return bar(x,foo(x,y-1));
    }


    public static int fun(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n%2==0)
        {
            return fun(x*x,n/2);
        }
        else
        {
            return x*fun(x*x,(n-1)/2);
        }
    }

}
