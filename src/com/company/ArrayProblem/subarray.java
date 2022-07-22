package com.company.ArrayProblem;

public class subarray {
    public static void main(String[] args) {
        //int[] A = {-5,4,6,-3,4,-1};
        //
        int[] A = {3,4,2,-1,6,7,8,9,3,2,-1,4};
        //int[] A ={-3,4,-2,5,3,-2,8,2,-1,4};
        //System.out.println(A.length);
        int[] PS = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                PS[0]=A[0];
            }
            else
            {
                PS[i]=PS[i-1]+A[i];
            }
        }
        int K = 6;
        int start=0;
        int end=K-1;
        int res = Integer.MIN_VALUE;
        while(start<=A.length-K)
        {

            int sum=0;
            //System.out.println();
            if(start==0)
            {
                sum=PS[end];
            }
            else
            {
                sum=PS[end]-PS[start-1];
            }
            System.out.print(start+" "+end+" : "+sum+"\n");
            res=Math.max(res,sum);
            start++;
            end++;
        }
        System.out.println(res);

    }
}
