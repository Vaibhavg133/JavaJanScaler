package com.company.Feb;

public class toggle {
    public static void main(String[] args) {
        int[] A = {1,0,0,0,0,1};
        int N = A.length;
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(A[i]==0)
            {
                count++;
                for(int j=i;j<N;j++) {
                    if (A[j] == 0) {
                        A[j] = 1;
                    } else {
                        A[j] = 0;
                    }
                }
            }
        }
        System.out.println(count);
        int switchPress=0;
        int currentState=0;
        for(int i=0;i<N;i++)
        {
            if(switchPress%2==0)
            {
                currentState=1;
            }
            else
            {
                if(A[i]==0)
                {
                    currentState=1;
                }
                else
                {
                    currentState=0;
                }
            }
            if(currentState==0)
            {
                switchPress++;
            }
        }
        System.out.println(switchPress);
    }
}
