package com.codingProblemCodeChef;

import java.util.Scanner;

public class KitchenTimings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println((b-a));
            testCase--;
        }
    }
}
