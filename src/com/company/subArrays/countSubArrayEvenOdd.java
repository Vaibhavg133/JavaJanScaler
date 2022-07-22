package com.company.subArrays;

public class countSubArrayEvenOdd {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int B = 4;
        int count = 0;
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=i;j<A.length;j++)
            {
                sum+=A[j];
                if((i+j+1)%2==0 && sum<B)
                {
                    count++;
                }
                else if((i+j+1)%2!=0 && sum>B)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
//        System.out.println(countEven+" "+countOdd);
    }
}
