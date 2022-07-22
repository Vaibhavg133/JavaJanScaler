package com.company.ArrayProblem;

public class swapOne {
    public static void main(String[] args) {
        String A = "1111";
        int ans=0;
        int countOne=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='1')
            {
                countOne++;
            }
        }
        for(int i=0;i<A.length();i++)
        {
            int countLeft=0;
            int countRight=0;
            if(A.charAt(i)=='0')
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(A.charAt(j)=='1')
                    {
                        countLeft++;
                    }
                    else
                    {
                        break;
                    }
                }
                for(int j=i+1;j<A.length();j++)
                {
                    if(A.charAt(j)=='1')
                    {
                        countRight++;
                    }
                    else
                    {
                        break;
                    }
                }
                int len = 0;
                if(countOne>(countLeft+countRight))
                {
                    len=countLeft+countRight+1;
                }
                else
                {
                    len=countLeft+countRight;
                }
                ans=Math.max(len,ans);
            }
        }
        System.out.println(ans);
    }
}
