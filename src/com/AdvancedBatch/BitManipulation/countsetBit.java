package com.AdvancedBatch.BitManipulation;

public class countsetBit {
    public static void main(String[] args) {
        int res = solve(4);
        System.out.println(res);
    }
    public static int solve(int A)
    {
        int count=0;
        for(int i=1;i<=A;i++)
        {
            int j=i;
            while(j!=0)
            {
                int lastBit=j&1;
                if(lastBit==1)
                {
                    count++;
                }
                j=j>>1;
            }
        }
        return count;
    }

}
