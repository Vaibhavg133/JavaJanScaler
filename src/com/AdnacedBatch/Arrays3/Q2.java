package com.AdnacedBatch.Arrays3;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,9,10,11,12,13,20,21};
        Arrays.sort(A);
        int start=0,end=0,ans=0;
        for(int i=0;i<A.length-1;i++)
        {
            if((A[i]-A[i+1])==-1)
            {
                end++;
                int len = end-start+1;
                //System.out.print(len+",");
                ans=Math.max(len,ans);
                //i=i+1;
            }
            else
            {
                //int len = end-start;
                //System.out.print(len+" ");
                start=i;
                end=i;
            }
        }
        System.out.println("ABC");
        System.out.println(ans);
    }
}
