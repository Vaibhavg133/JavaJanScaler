package com.codingProblems.leetCode;

public class P_231_PowerofTwo {
    public static void main(String[] args) {
        //show(3);
        System.out.println(show(3));
    }
    public static boolean show(int N)
    {
        if(N<=0)
        {
            return false;
        }
        int a=0;
        int res = 1;
        while(a<32)
        {
            res=1<<a;
            a++;
            if(res==N)
            {
                return true;
            }
            //System.out.println(res);
        }
        return false;
    }

}
