package com.company.Feb;

public class equilibriumIndex {
    public static void main(String[] args) {
        int[] A = {0,1,2,3,4,8,10};
        int N = A.length;
        int[] PS = new int[A.length];
        PS[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            PS[i]=PS[i-1]+A[i];
        }
        int index=-1;
        for(int i=1;i<A.length;i++)
        {

        }
//        for(int i=1;i<A.length;i++)
//        {
//            int suml=sum(A,0,i-1);
//            int sumr=sum(A,i+1,N-1);
//            if(suml==sumr) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);
    }
    public static int sum(int[] A,int a, int b)
    {
        int res=0;
        for(int i=a;i<=b;i++)
        {
            res=res+A[i];
        }
        return res;
    }

}
