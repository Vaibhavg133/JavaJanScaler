package com.company;

public class ArrayProblems {
    public static void main(String[] args) {
        //int[] A = {0,1,1,1,0,1,1,0,1,1,0};
        //int[] A = {1,1,1,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,1};
        int[] A = {0,0,1,1,1,0,0,1,0,0,1};
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            int countL=0;
            int countR=0;
            if(A[i]==0)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(A[j]==1)
                    {
                        countL++;
                    }
                    else
                    {
                        break;
                    }
                }
                for(int j=i+1;j<A.length;j++)
                {
                    if(A[j]==1)
                    {
                        countR++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            int res = countL+countR+1;
            ans=Math.max(ans,res);
        }
        System.out.println("Max "+ans);
    }
}
