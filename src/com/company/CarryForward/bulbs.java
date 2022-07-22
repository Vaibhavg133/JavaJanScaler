package com.company.CarryForward;

public class bulbs {
    public static void main(String[] args) {
        int[] A ={1,0,0,1,0};
        int res = bruteForce(A);
        System.out.println(res);
    }
    public static int bruteForce(int[] A)
    {
        int res = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
            {
                res++;
                for(int j=i;j<A.length;j++)
                {
                    if(A[j]==0)
                    {
                        A[j]=1;
                    }
                    else if(A[j]==1)
                    {
                        A[j]=0;
                    }
                }
            }
        }
        return res;
    }

}
