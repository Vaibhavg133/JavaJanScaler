package com.company.BitManipulation;

public class assignment {
    public static void main(String[] args) {
        int[] A = { 0, 1, 1, 0, 1 };
        printAllSubarrays(A);
        int temp=0;
        int B = A.length;
        int result=(B*(B+1))/2;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j< A.length;j++)
            {
                int xor = 0; int len = j-i-1;
                for(int k=i;k<=j;k++)
                {
                    xor+=A[k];
                }
                //System.out.println(xor);
                if(xor==0)
                {
                    temp++;
                }
//                if(countZero==len)
//                {
//                    temp++;
//                }

            }
        }
        result=result-temp;
        System.out.println("result: "+result);
    }
    public static void printAllSubarrays(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {

                for(int k=i;k<=j;k++)
                {
                    System.out.print(A[k]+" ");
                }
                int len=j-i+1;
                System.out.println("len" +len);
                System.out.println();
            }
        }
    }

}
