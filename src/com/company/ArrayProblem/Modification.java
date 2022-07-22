package com.company.ArrayProblem;

public class Modification {
    public static void main(String[] args) {
        int[] A = {1,1,1,0,1,1,1};
        int ans = Integer.MIN_VALUE;
        int count_One = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==1)
            {
                count_One++;
            }
        }
        for(int i=0;i<A.length;i++)
        {
            int l=0,r=0;
            if(A[i]==0)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(A[j]==1)
                    {
                        l++;
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
                        r++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            int len=0;
            if(count_One>(l+r)) {
                len=l+r+1;
            }
            else {
                len = l+r;
            }
            ans=Math.max(ans,len);
        }
        System.out.println(ans);
    }
}
