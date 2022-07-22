package com.company.ArrayProblem;

public class MaximumPositivity {
    public static void main(String[] args) {
        int[] A = {5,6,-1,7,8};
        int i=0,j=0,s=0,e=0;
        while(i<A.length && j<A.length)
        {
            if(A[j]>=0)
            {
                j++;
            }
            else
            {
                if (j - i > e - s + 1) {
                    s = i;
                    e = j - 1;
                }
                i = j + 1;
                j++;
            }
        }
        int count = s+e;
        //System.out.println(count+1);
        int[] result = new int[count+1];
        int cc = 0;
        for(int a=s;a<=e;a++)
        {
            result[cc]=A[a];
            cc++;
        }
        for(int a=0;a< result.length;a++)
        {
            System.out.print(result[a]+" ");
        }

    }
    public static void print(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }

    public static int[] storeArray(int[] A, int i, int j)
    {
        int count=0;
        int[] res = new int[A.length];
        for(int a=i;a<=j;a++)
        {
            res[count]=A[a];
            count++;
        }
        return res;
    }

}
