package com.company.Feb;

import java.util.Scanner;

public class latestMax {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int[] A = {6,4,1,2,5,6};
        //int[] A = {1,7,4,4,1,2,7};
        //int[] A = {2,2,6,4,5,1,5,2,6,4,1};
        int[] A = {814, 761, 697, 483, 981};
        int N = A.length;
        int maxx = max(A);
        System.out.println(maxx);
        int minn = min(A);
        System.out.println(minn);
        int latestMin = -1;
        int latestMax = -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            if(A[i]==maxx)
            {
                latestMax=i;
            }
            else if(A[i]==minn)
            {
                latestMin=i;
            }
            if(latestMin>-1 && latestMax>-1)
            {
                int res = abs(latestMin,latestMax)+1;
                //System.out.println(res);
                ans = Math.min(ans,res);
            }
        }
        System.out.println(ans);
    }
    static int abs(int A, int B)
    {
        int res = A-B;
        if (res<0)
        {
            return res*(-1);
        }
        return res;
    }
    static int max(int[] A)
    {
        int m = A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>m)
            {
                m=A[i];
            }
        }
        return m;
    }
    static int min(int[] A)
    {
        int m =Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<m)
            {
                m=A[i];
            }
        }
        return m;
    }

}
