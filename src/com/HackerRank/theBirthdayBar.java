package com.HackerRank;

public class theBirthdayBar {
    public static void main(String[] args) {
        int [] A = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};//{4};//{1,1,1,1,1,1};//{1,2,1,3,2};//{2,2,1,3,2};
        int d=18;
        int m=7;
        sumDisplay(A,m);
        //int res = birthdayBar(A,d,m);
        //System.out.println(res);
    }
    public static void sumDisplay(int[] A,int range)
    {
        for(int i=0;i<A.length-range;i++)
        {
            int sum=0;
            for(int j=i;j<i+range;j++)
            {
                sum+=A[j];
            }
            System.out.println(i+" to "+(i+range)+" is "+sum);
        }
    }

    public static int birthdayBar(int[] Array, int d, int m)
    {
        int count=0;
        if(Array.length==1 && m==1)
        {
            if(Array[0]==d)
            {
                return 1;
            }
        }
        for(int i=0;i< Array.length-m;i++)
        {
            int sum=0;
            for(int j=i;j<i+m;j++)
            {
                sum+=Array[j];
            }
            if(sum==d)
            {
                count++;
            }
        }
        return count;
    }

}
