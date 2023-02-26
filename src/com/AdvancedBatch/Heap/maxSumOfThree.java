package com.AdvancedBatch.Heap;

public class maxSumOfThree {
    public static void main(String[] args) {

        int[] A = {57, 3, -14, -87, 42, 38, 31, -7, -28, -61};//{24, -68, -29, -9, 84};
        int B = 10;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0 && B>=0)
            {
                A[i]=A[i]*-1;
                B--;
            }
        }

        int min = Integer.MAX_VALUE;
        while(B!=0)
        {
            for(int i=0;i<A.length;i++)
            {
                min=Math.min(A[i],min);
            }
            //allSum=allSum-(2*min);
            B--;
        }
        //System.out.println(allSum);
    }
}
