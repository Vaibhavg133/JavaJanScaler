package com.company.Feb;

public class specialIndex {
    public static void main(String[] args) {
        //int[] A = {2,1,6,4};
        int[] A = {4,3,2,7,6,-2};
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            System.out.println(i);
            int[] newArray = new int[A.length-1];
            int count=0;
            for(int j=0;j<A.length;j++)
            {
                if(i!=j)
                {
                    newArray[count]=A[j];
                    count++;
                    //System.out.print(A[j]+" ");
                }
            }
            int evenSum=0;
            int oddSum=0;
            for(int j=0;j< newArray.length;j++)
            {
                if(j%2==0)
                {
                    evenSum+=newArray[j];
                }
                else
                {
                    oddSum+=newArray[j];
                }
            }
            if(evenSum==oddSum)
            {
                ans++;
            }
            System.out.println();
        }
        System.out.println("ANS: "+ans);
    }
}
