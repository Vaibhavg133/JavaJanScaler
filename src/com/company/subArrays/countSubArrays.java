package com.company.subArrays;

public class countSubArrays {
    public static void main(String[] args) {
        //int[] A = {2,5,6};
        int[] A = {3,12,11,11,11,15};
        int B = 12;
        //int sum=0;
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=i;j< A.length;j++) {
                sum += A[j];
                System.out.print(sum + " ");
                if(sum<=B)
                {
                    count++;
                }
            }

        }
        System.out.println();
        System.out.println(count);
    }
}
