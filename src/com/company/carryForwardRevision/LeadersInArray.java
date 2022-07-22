package com.company.carryForwardRevision;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] A = {16,17,4,3,5,2};
        int[] res = solve(A);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
    public static int[] solve(int[] A)
    {
        int[] res = new int[A.length];
        int[] RM = new int[A.length];
        RM[A.length-1]=A[A.length-1];
        res[0]=RM[A.length-1];
        int count=0;
        for(int i= A.length-2;i>=0;i--)
        {
            RM[i]=Math.max(RM[i+1],A[i]);
            if(RM[i]==A[i])
            {
                res[count]=RM[i];
                count++;
            }
        }
        return res;
    }
}
