package com.CodeChef.Starters._71;

import java.util.Scanner;

public class snapChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase =sc.nextInt();
        while(testCase!=0)
        {
            int size=sc.nextInt();
            int[] A = new int[size];
            int[] B = new int[size];
            for(int i=0;i<size;i++)
            {
                A[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++)
            {
                B[i]=sc.nextInt();
            }
            int streak=0;
            int maxStreak=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                if(A[i]!=0 && B[i]!=0)
                {
                    streak++;
                    maxStreak=Math.max(maxStreak,streak);
                }
                else
                {
                    streak=0;
                    //maxStreak=streak;
                }
            }
            if(maxStreak==Integer.MIN_VALUE)
            {
                maxStreak=0;
            }
            System.out.println(maxStreak);
            testCase--;
        }
    }
}
