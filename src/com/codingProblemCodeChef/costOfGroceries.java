package com.codingProblemCodeChef;

import java.util.Scanner;

public class costOfGroceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0)
        {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] freshness = new int[N];
            for(int i=0;i<N;i++)
            {
                freshness[i]=sc.nextInt();
            }
            int[] cost=new int[N];
            for(int i=0;i<N;i++)
            {
                cost[i]=sc.nextInt();
            }
            int res= findTotalCost(N,X,freshness,cost);
            System.out.println(res);
            testCase--;
        }
    }
    public static int findTotalCost(int N,int X, int[] fresh, int[] cost)
    {
        int maincost=0;
        for(int i=0;i<fresh.length;i++)
        {
            if(fresh[i]>=X)
            {
                maincost+=cost[i];
            }
        }
        return maincost;
    }

}
