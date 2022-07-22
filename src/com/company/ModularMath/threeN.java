package com.company.ModularMath;

public class threeN {
    public static void main(String[] args) {
        int[] A = {2,4,4,3,2,6,6,7,7,7,6,4,2};
        int a = findUniqueBruteForce(A);
        System.out.println(a);

    }
    public static int findUniqueBruteForce(int[] A)
    {
        int[] B = new int[2];
        for(int i=0;i<A.length;i++)
        {
            int count=0;
            for(int j=0;j<A.length;j++)
            {
                if(A[i]==A[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                return A[i];
            }
        }
        return -1;
    }

}
